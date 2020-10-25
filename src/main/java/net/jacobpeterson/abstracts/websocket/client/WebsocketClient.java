package net.jacobpeterson.abstracts.websocket.client;

import net.jacobpeterson.abstracts.websocket.listener.StreamListener;
import net.jacobpeterson.abstracts.websocket.message.StreamMessage;
import net.jacobpeterson.abstracts.websocket.message.StreamMessageType;

/**
 * The type Websocket client.
 */
public interface WebsocketClient {

    /**
     * Adds a listener. Note that this method is blocking.
     *
     * @param streamListener the stream listener
     */
    void addListener(StreamListener<?, ?> streamListener);

    /**
     * Remove listener. Note that this method is blocking.
     *
     * @param streamListener the stream listener
     */
    void removeListener(StreamListener<?, ?> streamListener);

    /**
     * Connects. Note that this method is blocking.
     */
    void connect();

    /**
     * Disconnects. Note that this method is blocking.
     */
    void disconnect();

    /**
     * Send authentication message. Note that this method is blocking.
     */
    void sendAuthenticationMessage();

    /**
     * Handle resubscribing. Note that this method is blocking.
     */
    void handleResubscribing();

    /**
     * Handle websocket message.
     *
     * @param message the message
     */
    void handleWebsocketMessage(String message);

    /**
     * Send stream message to listeners.
     *
     * @param streamMessageType the stream message type
     * @param streamMessage     the stream message
     */
    void sendStreamMessageToListeners(StreamMessageType streamMessageType, StreamMessage streamMessage);

    /**
     * Returns true if the websocket is connected.
     *
     * @return the boolean
     */
    boolean isConnected();

    /**
     * Returns true if the websocket is authenticated.
     *
     * @return the boolean
     */
    boolean isAuthenticated();
}
