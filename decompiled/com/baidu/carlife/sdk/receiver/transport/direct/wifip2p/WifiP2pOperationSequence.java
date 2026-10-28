package com.baidu.carlife.sdk.receiver.transport.direct.wifip2p;

import android.net.wifi.p2p.WifiP2pManager;
import com.baidu.carlife.sdk.Constants;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import com.baidu.carlife.sdk.util.Logger;
import i9.l;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0011R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/baidu/carlife/sdk/receiver/transport/direct/wifip2p/WifiP2pOperationSequence;", "Landroid/net/wifi/p2p/WifiP2pManager$ActionListener;", "listener", "<init>", "(Landroid/net/wifi/p2p/WifiP2pManager$ActionListener;)V", "Lcom/baidu/carlife/sdk/receiver/transport/direct/wifip2p/WifiP2pOperation;", "operation", "Lt8/z;", "add", "(Lcom/baidu/carlife/sdk/receiver/transport/direct/wifip2p/WifiP2pOperation;)V", "execute", "()V", "onSuccess", "", "reason", "onFailure", "(I)V", "Landroid/net/wifi/p2p/WifiP2pManager$ActionListener;", "", "sequence", "Ljava/util/List;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "executing", "Ljava/util/concurrent/atomic/AtomicBoolean;", "currentIndex", "I", "carlife-sdk_release"}, k = 1, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
public final class WifiP2pOperationSequence implements WifiP2pManager.ActionListener {
    private int currentIndex;
    private final AtomicBoolean executing;
    private final WifiP2pManager.ActionListener listener;
    private final List<WifiP2pOperation> sequence;

    public WifiP2pOperationSequence(WifiP2pManager.ActionListener actionListener) {
        l.e(actionListener, "listener");
        this.listener = actionListener;
        this.sequence = new ArrayList();
        this.executing = new AtomicBoolean(false);
    }

    public final void add(WifiP2pOperation operation) {
        l.e(operation, "operation");
        this.sequence.add(operation);
    }

    public final void execute() {
        if (this.executing.getAndSet(true)) {
            return;
        }
        this.currentIndex = 0;
        this.sequence.get(0).execute(this);
    }

    @Override // android.net.wifi.p2p.WifiP2pManager.ActionListener
    public void onFailure(int reason) {
        Logger.INSTANCE.d(Constants.TAG, "WifiP2pOperationSequence onFailure ", this.sequence.get(this.currentIndex), ", currentIndex: ", Integer.valueOf(this.currentIndex), ", reason: ", Integer.valueOf(reason));
        this.executing.set(false);
        this.listener.onFailure(reason);
        this.currentIndex = 0;
    }

    @Override // android.net.wifi.p2p.WifiP2pManager.ActionListener
    public void onSuccess() {
        int i7 = this.currentIndex + 1;
        this.currentIndex = i7;
        if (i7 != this.sequence.size()) {
            this.sequence.get(this.currentIndex).execute(this);
            return;
        }
        this.executing.set(false);
        this.currentIndex = 0;
        this.listener.onSuccess();
    }
}
