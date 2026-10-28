package r5;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.Handler;
import g7.i;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a implements SensorEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i f11625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Handler f11626b;

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i7) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        Handler handler = this.f11626b;
        float f10 = sensorEvent.values[0];
        if (f10 <= 45.0f) {
            handler.post(new g7.e(this, 1, true));
        } else if (f10 >= 450.0f) {
            handler.post(new g7.e(this, 1, false));
        }
    }
}
