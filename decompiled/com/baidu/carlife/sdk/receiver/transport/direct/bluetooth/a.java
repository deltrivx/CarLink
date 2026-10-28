package com.baidu.carlife.sdk.receiver.transport.direct.bluetooth;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BluetoothDeviceDiscover1 f2701b;

    public /* synthetic */ a(BluetoothDeviceDiscover1 bluetoothDeviceDiscover1, int i7) {
        this.f2700a = i7;
        this.f2701b = bluetoothDeviceDiscover1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2700a) {
            case 0:
                this.f2701b.performScan();
                break;
            default:
                BluetoothDeviceDiscover1.performScan$lambda$3(this.f2701b);
                break;
        }
    }
}
