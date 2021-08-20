package dontpad;

import io.javalin.websocket.WsContext;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class Collab {
    public String doc; //document
    public Set<WsContext> clients; //collaborators

    public Collab() {
        this.doc = "";
        this.clients = ConcurrentHashMap.newKeySet();
    }
}
