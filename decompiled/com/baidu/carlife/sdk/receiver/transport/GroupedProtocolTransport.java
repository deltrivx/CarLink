package com.baidu.carlife.sdk.receiver.transport;

import android.content.Intent;
import androidx.lifecycle.z;
import com.baidu.carlife.sdk.CarLifeContext;
import com.baidu.carlife.sdk.Configs;
import com.baidu.carlife.sdk.a;
import com.baidu.carlife.sdk.internal.protocol.CarLifeMessage;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import com.baidu.carlife.sdk.internal.transport.MessageDispatcher;
import com.baidu.carlife.sdk.internal.transport.ProtocolTransport;
import com.baidu.carlife.sdk.internal.transport.TransportListener;
import com.baidu.carlife.sdk.internal.transport.b;
import com.baidu.carlife.sdk.receiver.transport.aoa.AOAProtocolTransport;
import com.baidu.carlife.sdk.receiver.transport.direct.DirectProtocolTransport;
import com.baidu.carlife.sdk.receiver.transport.hotspot.HotspotProtocolTransport;
import i9.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\tJ\r\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\tJ\r\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\tJ\u0015\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\tJ\u0015\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0015J\u0017\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001c\u0010\u001bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001dR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00180\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010\"\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lcom/baidu/carlife/sdk/receiver/transport/GroupedProtocolTransport;", "Lcom/baidu/carlife/sdk/internal/transport/ProtocolTransport$ConnectionListener;", "Lcom/baidu/carlife/sdk/internal/transport/TransportListener;", "Lcom/baidu/carlife/sdk/CarLifeContext;", "context", "<init>", "(Lcom/baidu/carlife/sdk/CarLifeContext;)V", "Lt8/z;", "connect", "()V", "stopConnect", "configConnectType", "ready", "Landroid/content/Intent;", "intent", "onNewIntent", "(Landroid/content/Intent;)V", "terminate", "Lcom/baidu/carlife/sdk/internal/protocol/CarLifeMessage;", "message", "postMessage", "(Lcom/baidu/carlife/sdk/internal/protocol/CarLifeMessage;)V", "sendMessage", "dispatchMessage", "Lcom/baidu/carlife/sdk/internal/transport/ProtocolTransport;", "transport", "onConnectionAttached", "(Lcom/baidu/carlife/sdk/internal/transport/ProtocolTransport;)V", "onConnectionDetached", "Lcom/baidu/carlife/sdk/CarLifeContext;", "", "transports", "Ljava/util/List;", "Lcom/baidu/carlife/sdk/internal/transport/MessageDispatcher;", "messageDispatcher", "Lcom/baidu/carlife/sdk/internal/transport/MessageDispatcher;", "carlife-sdk_release"}, k = 1, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
public final class GroupedProtocolTransport implements ProtocolTransport.ConnectionListener, TransportListener {
    private final CarLifeContext context;
    private MessageDispatcher messageDispatcher;
    private final List<ProtocolTransport> transports;

    public GroupedProtocolTransport(CarLifeContext carLifeContext) {
        l.e(carLifeContext, "context");
        this.context = carLifeContext;
        this.transports = new ArrayList();
        configConnectType();
    }

    public final void configConnectType() {
        stopConnect();
        int feature = this.context.getFeature(Configs.FEATURE_CONFIG_CONNECT_TYPE, 2);
        if (feature == 5) {
            this.transports.add(new HotspotProtocolTransport(this.context, this));
            this.context.setConnectionType(5);
        } else if (feature != 9) {
            this.transports.add(new AOAProtocolTransport(this.context, this));
            this.context.setConnectionType(2);
        } else {
            this.transports.add(new DirectProtocolTransport(this.context, this));
            this.context.setConnectionType(9);
        }
    }

    public final void connect() {
        this.context.onConnectionWait();
        if (this.transports.isEmpty()) {
            configConnectType();
        }
        Iterator<T> it = this.transports.iterator();
        while (it.hasNext()) {
            ((ProtocolTransport) it.next()).connect();
        }
    }

    public final void dispatchMessage(CarLifeMessage message) {
        l.e(message, "message");
        MessageDispatcher messageDispatcher = this.messageDispatcher;
        if (messageDispatcher != null) {
            messageDispatcher.dispatchMessage(message);
        }
    }

    @Override // com.baidu.carlife.sdk.ConnectionChangeListener
    public final /* synthetic */ void onConnectionAttached(CarLifeContext carLifeContext) {
        a.a(this, carLifeContext);
    }

    @Override // com.baidu.carlife.sdk.internal.transport.ProtocolTransport.ConnectionListener
    public void onConnectionAttached(ProtocolTransport transport) {
        ProtocolTransport protocolTransport;
        l.e(transport, "transport");
        for (ProtocolTransport protocolTransport2 : this.transports) {
            if (transport == protocolTransport2) {
                protocolTransport = transport;
                this.messageDispatcher = new MessageDispatcher(this.context, protocolTransport, false, 4, null);
                if (protocolTransport instanceof AOAProtocolTransport) {
                    this.context.setConnectionType(2);
                } else if (protocolTransport instanceof HotspotProtocolTransport) {
                    this.context.setConnectionType(5);
                } else if (protocolTransport instanceof DirectProtocolTransport) {
                    this.context.setConnectionType(9);
                }
            } else {
                protocolTransport = transport;
                protocolTransport2.terminate();
            }
            transport = protocolTransport;
        }
        this.context.setVersionSupport(true);
        this.context.onConnectionAttached();
        MessageDispatcher messageDispatcher = this.messageDispatcher;
        if (messageDispatcher != null) {
            messageDispatcher.start();
        }
    }

    @Override // com.baidu.carlife.sdk.ConnectionChangeListener
    public final /* synthetic */ void onConnectionAuthenFailed(CarLifeContext carLifeContext) {
        a.b(this, carLifeContext);
    }

    @Override // com.baidu.carlife.sdk.ConnectionChangeListener
    public final /* synthetic */ void onConnectionDetached(CarLifeContext carLifeContext) {
        a.c(this, carLifeContext);
    }

    @Override // com.baidu.carlife.sdk.internal.transport.ProtocolTransport.ConnectionListener
    public void onConnectionDetached(ProtocolTransport transport) {
        l.e(transport, "transport");
        MessageDispatcher messageDispatcher = this.messageDispatcher;
        if (transport.equals(messageDispatcher != null ? messageDispatcher.getTransport() : null)) {
            MessageDispatcher messageDispatcher2 = this.messageDispatcher;
            if (messageDispatcher2 != null) {
                messageDispatcher2.terminate();
            }
            this.messageDispatcher = null;
            if (this.context.getIsVersionSupport()) {
                this.context.postDelayed(new z(12, this), 3000L);
            } else {
                ready();
            }
            this.context.onConnectionDetached();
        }
    }

    @Override // com.baidu.carlife.sdk.ConnectionChangeListener
    public final /* synthetic */ void onConnectionEstablished(CarLifeContext carLifeContext) {
        a.d(this, carLifeContext);
    }

    @Override // com.baidu.carlife.sdk.ConnectionChangeListener
    public final /* synthetic */ void onConnectionPrompt(String str) {
        a.e(this, str);
    }

    @Override // com.baidu.carlife.sdk.ConnectionChangeListener
    public final /* synthetic */ void onConnectionReattached(CarLifeContext carLifeContext) {
        a.f(this, carLifeContext);
    }

    @Override // com.baidu.carlife.sdk.ConnectionChangeListener
    public final /* synthetic */ void onConnectionVersionNotSupprt(CarLifeContext carLifeContext) {
        a.g(this, carLifeContext);
    }

    @Override // com.baidu.carlife.sdk.ConnectionChangeListener
    public final /* synthetic */ void onConnectionWait() {
        a.h(this);
    }

    public final void onNewIntent(Intent intent) {
        l.e(intent, "intent");
        Iterator<T> it = this.transports.iterator();
        while (it.hasNext()) {
            ((ProtocolTransport) it.next()).onNewIntent(intent);
        }
    }

    @Override // com.baidu.carlife.sdk.internal.transport.TransportListener
    public final /* synthetic */ boolean onReceiveMessage(CarLifeContext carLifeContext, CarLifeMessage carLifeMessage) {
        return b.a(this, carLifeContext, carLifeMessage);
    }

    @Override // com.baidu.carlife.sdk.internal.transport.TransportListener
    public final /* synthetic */ boolean onSendMessage(CarLifeContext carLifeContext, CarLifeMessage carLifeMessage) {
        return b.b(this, carLifeContext, carLifeMessage);
    }

    public final void postMessage(CarLifeMessage message) {
        l.e(message, "message");
        MessageDispatcher messageDispatcher = this.messageDispatcher;
        if (messageDispatcher != null) {
            messageDispatcher.postMessage(message);
        }
    }

    public final void ready() {
        Iterator<T> it = this.transports.iterator();
        while (it.hasNext()) {
            ((ProtocolTransport) it.next()).ready();
        }
    }

    public final void sendMessage(CarLifeMessage message) {
        l.e(message, "message");
        MessageDispatcher messageDispatcher = this.messageDispatcher;
        if (messageDispatcher != null) {
            messageDispatcher.sendMessage(message);
        }
    }

    public final void stopConnect() {
        while (!this.transports.isEmpty()) {
            this.transports.remove(0).terminate();
        }
    }

    public final void terminate() {
        Iterator<T> it = this.transports.iterator();
        while (it.hasNext()) {
            ((ProtocolTransport) it.next()).terminate();
        }
    }
}
