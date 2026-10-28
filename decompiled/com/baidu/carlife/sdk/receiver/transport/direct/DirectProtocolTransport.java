package com.baidu.carlife.sdk.receiver.transport.direct;

import com.baidu.carlife.sdk.CarLifeContext;
import com.baidu.carlife.sdk.Constants;
import com.baidu.carlife.sdk.internal.protocol.CarLifeMessage;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import com.baidu.carlife.sdk.internal.transport.ProtocolTransport;
import com.baidu.carlife.sdk.receiver.transport.direct.bluetooth.BluetoothLeAdvertiser;
import com.baidu.carlife.sdk.receiver.transport.wirless.WirlessConnector;
import com.baidu.carlife.sdk.util.Logger;
import i9.l;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0012\u0010\fJ\u000f\u0010\u0013\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0013\u0010\fJ\u000f\u0010\u0014\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0014\u0010\fJ\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lcom/baidu/carlife/sdk/receiver/transport/direct/DirectProtocolTransport;", "Lcom/baidu/carlife/sdk/internal/transport/ProtocolTransport;", "Lcom/baidu/carlife/sdk/receiver/transport/direct/bluetooth/BluetoothLeAdvertiser$Callback;", "Lcom/baidu/carlife/sdk/receiver/transport/direct/InstantConnectionSetup$Callback;", "Lcom/baidu/carlife/sdk/CarLifeContext;", "mCarLifeContext", "Lcom/baidu/carlife/sdk/internal/transport/ProtocolTransport$ConnectionListener;", "connectionListener", "<init>", "(Lcom/baidu/carlife/sdk/CarLifeContext;Lcom/baidu/carlife/sdk/internal/transport/ProtocolTransport$ConnectionListener;)V", "Lt8/z;", "connect", "()V", "isAdvertising", "", "address", "onDeviceConnected", "(Ljava/lang/String;)V", "ready", "listen", "terminate", "Lcom/baidu/carlife/sdk/internal/protocol/CarLifeMessage;", "message", "write", "(Lcom/baidu/carlife/sdk/internal/protocol/CarLifeMessage;)V", "read", "()Lcom/baidu/carlife/sdk/internal/protocol/CarLifeMessage;", "Lcom/baidu/carlife/sdk/CarLifeContext;", "Lcom/baidu/carlife/sdk/receiver/transport/wirless/WirlessConnector;", "mWirelessConnector", "Lcom/baidu/carlife/sdk/receiver/transport/wirless/WirlessConnector;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isConnectFlag", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Lcom/baidu/carlife/sdk/receiver/transport/direct/bluetooth/BluetoothLeAdvertiser;", "bluetoothLeAdvertiser", "Lcom/baidu/carlife/sdk/receiver/transport/direct/bluetooth/BluetoothLeAdvertiser;", "Lcom/baidu/carlife/sdk/receiver/transport/direct/InstantConnectionSetup;", "mInstantConnectionSetup", "Lcom/baidu/carlife/sdk/receiver/transport/direct/InstantConnectionSetup;", "", "isConnecting", "()Z", "carlife-sdk_release"}, k = 1, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
public final class DirectProtocolTransport extends ProtocolTransport implements BluetoothLeAdvertiser.Callback, InstantConnectionSetup.Callback {
    private final BluetoothLeAdvertiser bluetoothLeAdvertiser;
    private final AtomicBoolean isConnectFlag;
    private final CarLifeContext mCarLifeContext;
    private final InstantConnectionSetup mInstantConnectionSetup;
    private final WirlessConnector mWirelessConnector;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DirectProtocolTransport(CarLifeContext carLifeContext, ProtocolTransport.ConnectionListener connectionListener) {
        super(carLifeContext, connectionListener);
        l.e(carLifeContext, "mCarLifeContext");
        this.mCarLifeContext = carLifeContext;
        this.mWirelessConnector = new WirlessConnector();
        this.isConnectFlag = new AtomicBoolean(false);
        this.bluetoothLeAdvertiser = new BluetoothLeAdvertiser(getContext(), this);
        this.mInstantConnectionSetup = new InstantConnectionSetup(carLifeContext, this);
    }

    private final boolean isConnecting() {
        return this.mCarLifeContext.getConnectionState() != 0;
    }

    @Override // com.baidu.carlife.sdk.internal.transport.ProtocolTransport
    public void connect() {
        this.bluetoothLeAdvertiser.startAdvertising();
        Logger.INSTANCE.d(Constants.TAG, "InstantProtocolTransport connect");
    }

    @Override // com.baidu.carlife.sdk.receiver.transport.direct.bluetooth.BluetoothLeAdvertiser.Callback
    public void isAdvertising() {
        this.mInstantConnectionSetup.connect();
    }

    @Override // com.baidu.carlife.sdk.internal.transport.ProtocolTransport
    public void listen() {
    }

    @Override // com.baidu.carlife.sdk.receiver.transport.direct.InstantConnectionSetup.Callback
    public void onDeviceConnected(String address) {
        l.e(address, "address");
        if (isConnecting()) {
            return;
        }
        try {
            if (this.mWirelessConnector.startConnect(address)) {
                Logger.INSTANCE.d(Constants.TAG, "WifiDirect onConnectionAttached");
                onConnectionAttached();
                this.bluetoothLeAdvertiser.stopAdvertising();
            }
        } catch (Exception e7) {
            Logger.INSTANCE.e(Constants.TAG, "wifi getByName exception ", e7);
        }
    }

    @Override // com.baidu.carlife.sdk.internal.transport.ProtocolTransport
    public CarLifeMessage read() {
        return this.mWirelessConnector.read();
    }

    @Override // com.baidu.carlife.sdk.internal.transport.ProtocolTransport
    public void ready() {
    }

    @Override // com.baidu.carlife.sdk.internal.transport.ProtocolTransport
    public void terminate() {
        Logger.INSTANCE.d(Constants.TAG, "InstantProtocolTransport terminate");
        this.isConnectFlag.set(false);
        this.bluetoothLeAdvertiser.stopAdvertising();
        this.mInstantConnectionSetup.terminate();
        this.mWirelessConnector.terminate();
        onConnectionDetached();
    }

    @Override // com.baidu.carlife.sdk.internal.transport.ProtocolTransport
    public void write(CarLifeMessage message) throws IOException {
        l.e(message, "message");
        this.mWirelessConnector.write(message);
    }
}
