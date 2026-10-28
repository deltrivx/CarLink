package com.baidu.carlife.sdk.internal.transport;

import android.content.Intent;
import com.baidu.carlife.sdk.CarLifeContext;
import com.baidu.carlife.sdk.internal.protocol.CarLifeMessage;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import i9.g;
import i9.l;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\b&\u0018\u00002\u00020\u0001:\u0001 B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH&¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\r\u001a\u00020\bH&¢\u0006\u0004\b\r\u0010\nJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000eH&¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\b¢\u0006\u0004\b\u0018\u0010\nJ\r\u0010\u0019\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lcom/baidu/carlife/sdk/internal/transport/ProtocolTransport;", "", "Lcom/baidu/carlife/sdk/CarLifeContext;", "context", "Lcom/baidu/carlife/sdk/internal/transport/ProtocolTransport$ConnectionListener;", "connectionListener", "<init>", "(Lcom/baidu/carlife/sdk/CarLifeContext;Lcom/baidu/carlife/sdk/internal/transport/ProtocolTransport$ConnectionListener;)V", "Lt8/z;", "connect", "()V", "ready", "listen", "terminate", "Lcom/baidu/carlife/sdk/internal/protocol/CarLifeMessage;", "message", "write", "(Lcom/baidu/carlife/sdk/internal/protocol/CarLifeMessage;)V", "read", "()Lcom/baidu/carlife/sdk/internal/protocol/CarLifeMessage;", "Landroid/content/Intent;", "intent", "onNewIntent", "(Landroid/content/Intent;)V", "onConnectionAttached", "onConnectionDetached", "Lcom/baidu/carlife/sdk/CarLifeContext;", "getContext", "()Lcom/baidu/carlife/sdk/CarLifeContext;", "Lcom/baidu/carlife/sdk/internal/transport/ProtocolTransport$ConnectionListener;", "getConnectionListener", "()Lcom/baidu/carlife/sdk/internal/transport/ProtocolTransport$ConnectionListener;", "ConnectionListener", "carlife-sdk_release"}, k = 1, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
public abstract class ProtocolTransport {
    private final ConnectionListener connectionListener;
    private final CarLifeContext context;

    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/baidu/carlife/sdk/internal/transport/ProtocolTransport$ConnectionListener;", "", "Lcom/baidu/carlife/sdk/internal/transport/ProtocolTransport;", "transport", "Lt8/z;", "onConnectionAttached", "(Lcom/baidu/carlife/sdk/internal/transport/ProtocolTransport;)V", "onConnectionDetached", "carlife-sdk_release"}, k = 1, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
    public interface ConnectionListener {

        /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
        @Metadata(k = 3, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
        public static final class DefaultImpls {
            @Deprecated
            public static void onConnectionAttached(ConnectionListener connectionListener, ProtocolTransport protocolTransport) {
                l.e(protocolTransport, "transport");
                a.a(connectionListener, protocolTransport);
            }

            @Deprecated
            public static void onConnectionDetached(ConnectionListener connectionListener, ProtocolTransport protocolTransport) {
                l.e(protocolTransport, "transport");
                a.b(connectionListener, protocolTransport);
            }
        }

        void onConnectionAttached(ProtocolTransport transport);

        void onConnectionDetached(ProtocolTransport transport);
    }

    public ProtocolTransport(CarLifeContext carLifeContext, ConnectionListener connectionListener) {
        l.e(carLifeContext, "context");
        this.context = carLifeContext;
        this.connectionListener = connectionListener;
    }

    public /* synthetic */ ProtocolTransport(CarLifeContext carLifeContext, ConnectionListener connectionListener, int i7, g gVar) {
        this(carLifeContext, (i7 & 2) != 0 ? null : connectionListener);
    }

    public abstract void connect();

    public final ConnectionListener getConnectionListener() {
        return this.connectionListener;
    }

    public final CarLifeContext getContext() {
        return this.context;
    }

    public abstract void listen();

    public final void onConnectionAttached() {
        ConnectionListener connectionListener = this.connectionListener;
        if (connectionListener != null) {
            connectionListener.onConnectionAttached(this);
        }
    }

    public final void onConnectionDetached() {
        ConnectionListener connectionListener = this.connectionListener;
        if (connectionListener != null) {
            connectionListener.onConnectionDetached(this);
        }
    }

    public void onNewIntent(Intent intent) {
        l.e(intent, "intent");
    }

    public abstract CarLifeMessage read();

    public abstract void ready();

    public abstract void terminate();

    public abstract void write(CarLifeMessage message);
}
