package com.baidu.carlife.sdk.receiver.transport.aoa;

import com.baidu.carlife.sdk.CarLifeContext;
import com.baidu.carlife.sdk.Constants;
import com.baidu.carlife.sdk.internal.protocol.CarLifeMessage;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import com.baidu.carlife.sdk.internal.transport.ProtocolTransport;
import com.baidu.carlife.sdk.internal.transport.communicator.Communicator;
import com.baidu.carlife.sdk.util.Logger;
import i9.l;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\nJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/baidu/carlife/sdk/receiver/transport/aoa/AOAProtocolTransport;", "Lcom/baidu/carlife/sdk/internal/transport/ProtocolTransport;", "Lcom/baidu/carlife/sdk/CarLifeContext;", "context", "Lcom/baidu/carlife/sdk/internal/transport/ProtocolTransport$ConnectionListener;", "connectionListener", "<init>", "(Lcom/baidu/carlife/sdk/CarLifeContext;Lcom/baidu/carlife/sdk/internal/transport/ProtocolTransport$ConnectionListener;)V", "Lt8/z;", "connect", "()V", "ready", "listen", "terminate", "Lcom/baidu/carlife/sdk/internal/protocol/CarLifeMessage;", "message", "write", "(Lcom/baidu/carlife/sdk/internal/protocol/CarLifeMessage;)V", "read", "()Lcom/baidu/carlife/sdk/internal/protocol/CarLifeMessage;", "Lcom/baidu/carlife/sdk/internal/transport/communicator/Communicator;", "communicator", "Lcom/baidu/carlife/sdk/internal/transport/communicator/Communicator;", "Lcom/baidu/carlife/sdk/receiver/transport/aoa/UsbAccessoryScanner;", "scanner", "Lcom/baidu/carlife/sdk/receiver/transport/aoa/UsbAccessoryScanner;", "carlife-sdk_release"}, k = 1, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
public final class AOAProtocolTransport extends ProtocolTransport {
    private Communicator communicator;
    private final UsbAccessoryScanner scanner;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AOAProtocolTransport(CarLifeContext carLifeContext, ProtocolTransport.ConnectionListener connectionListener) {
        super(carLifeContext, connectionListener);
        l.e(carLifeContext, "context");
        l.e(connectionListener, "connectionListener");
        this.scanner = new UsbAccessoryScanner(carLifeContext, new AOAProtocolTransport$scanner$1(this));
    }

    @Override // com.baidu.carlife.sdk.internal.transport.ProtocolTransport
    public void connect() {
        getContext().onConnectionPrompt("等待有线连接");
        Logger.INSTANCE.d(Constants.TAG, "AOAProtocolTransport connect");
        this.scanner.scan();
    }

    @Override // com.baidu.carlife.sdk.internal.transport.ProtocolTransport
    public void listen() {
    }

    @Override // com.baidu.carlife.sdk.internal.transport.ProtocolTransport
    public CarLifeMessage read() {
        CarLifeMessage carLifeMessage;
        Communicator communicator = this.communicator;
        if (communicator == null || (carLifeMessage = communicator.read()) == null) {
            throw new IllegalStateException("read from unattached transport");
        }
        return carLifeMessage;
    }

    @Override // com.baidu.carlife.sdk.internal.transport.ProtocolTransport
    public void ready() {
        Logger.INSTANCE.d(Constants.TAG, "AOAProtocolTransport ready");
        this.scanner.ready();
    }

    @Override // com.baidu.carlife.sdk.internal.transport.ProtocolTransport
    public void terminate() {
        this.scanner.stop();
        Communicator communicator = this.communicator;
        if (communicator != null) {
            communicator.terminate();
            this.communicator = null;
            onConnectionDetached();
        }
        Logger.INSTANCE.d(Constants.TAG, "AOAProtocolTransport terminate");
    }

    @Override // com.baidu.carlife.sdk.internal.transport.ProtocolTransport
    public void write(CarLifeMessage message) {
        l.e(message, "message");
        Communicator communicator = this.communicator;
        if (communicator != null) {
            communicator.write(message);
        }
    }
}
