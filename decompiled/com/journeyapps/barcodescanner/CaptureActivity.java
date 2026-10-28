package com.journeyapps.barcodescanner;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.KeyEvent;
import com.baidu.carlifevehicle.R;
import f7.g;
import f7.j;
import f7.q;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;
import n5.a;
import n5.h;
import r5.d;
import r5.e;
import u0.k;
import u3.f;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class CaptureActivity extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j f2895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public DecoratedBarcodeView f2896b;

    /* JADX WARN: Code duplicated, block: B:17:0x0069  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d4  */
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        boolean z10;
        Set setNoneOf;
        int intExtra;
        int i7;
        super.onCreate(bundle);
        setContentView(R.layout.zxing_capture);
        this.f2896b = (DecoratedBarcodeView) findViewById(R.id.zxing_barcode_scanner);
        DecoratedBarcodeView decoratedBarcodeView = this.f2896b;
        j jVar = new j(this, decoratedBarcodeView);
        this.f2895a = jVar;
        Intent intent = getIntent();
        getWindow().addFlags(128);
        if (bundle != null) {
            jVar.f5419c = bundle.getInt("SAVED_ORIENTATION_LOCK", -1);
        }
        if (intent != null) {
            if (intent.getBooleanExtra("SCAN_ORIENTATION_LOCKED", true)) {
                if (jVar.f5419c == -1) {
                    int rotation = getWindowManager().getDefaultDisplay().getRotation();
                    int i10 = getResources().getConfiguration().orientation;
                    if (i10 == 2) {
                        if (rotation == 0 || rotation == 1) {
                            i7 = 0;
                        } else {
                            i7 = 8;
                        }
                    } else if (i10 == 1) {
                        i7 = (rotation == 0 || rotation == 3) ? 1 : 9;
                    } else {
                        i7 = 0;
                    }
                    jVar.f5419c = i7;
                }
                setRequestedOrientation(jVar.f5419c);
            }
            if ("com.google.zxing.client.android.SCAN".equals(intent.getAction())) {
                Pattern pattern = d.f11627a;
                String stringExtra = intent.getStringExtra("SCAN_FORMATS");
                EnumMap enumMap = null;
                List listAsList = stringExtra != null ? Arrays.asList(d.f11627a.split(stringExtra)) : null;
                String stringExtra2 = intent.getStringExtra("SCAN_MODE");
                if (listAsList != null) {
                    setNoneOf = EnumSet.noneOf(a.class);
                    try {
                        Iterator it = listAsList.iterator();
                        while (it.hasNext()) {
                            setNoneOf.add(a.valueOf((String) it.next()));
                        }
                    } catch (IllegalArgumentException unused) {
                        if (stringExtra2 != null) {
                            setNoneOf = (Set) d.f11628b.get(stringExtra2);
                        } else {
                            setNoneOf = null;
                        }
                    }
                } else if (stringExtra2 != null) {
                    setNoneOf = (Set) d.f11628b.get(stringExtra2);
                } else {
                    setNoneOf = null;
                }
                int i11 = e.f11629a;
                Bundle extras = intent.getExtras();
                if (extras != null && !extras.isEmpty()) {
                    enumMap = new EnumMap(n5.d.class);
                    for (n5.d dVar : n5.d.values()) {
                        if (dVar != n5.d.CHARACTER_SET && dVar != n5.d.NEED_RESULT_POINT_CALLBACK && dVar != n5.d.POSSIBLE_FORMATS) {
                            String strName = dVar.name();
                            Class cls = dVar.f8820a;
                            if (extras.containsKey(strName)) {
                                if (cls.equals(Void.class)) {
                                    enumMap.put(dVar, Boolean.TRUE);
                                } else {
                                    Object obj = extras.get(strName);
                                    if (cls.isInstance(obj)) {
                                        enumMap.put(dVar, obj);
                                    } else {
                                        Log.w("e", "Ignoring hint " + dVar + " because it is not assignable from " + obj);
                                    }
                                }
                            }
                        }
                    }
                    Log.i("e", "Hints from the Intent: " + enumMap);
                }
                g7.j jVar2 = new g7.j();
                if (intent.hasExtra("SCAN_CAMERA_ID") && (intExtra = intent.getIntExtra("SCAN_CAMERA_ID", -1)) >= 0) {
                    jVar2.f5995a = intExtra;
                }
                if (intent.hasExtra("TORCH_ENABLED") && intent.getBooleanExtra("TORCH_ENABLED", false)) {
                    decoratedBarcodeView.f2897a.setTorch(true);
                }
                String stringExtra3 = intent.getStringExtra("PROMPT_MESSAGE");
                if (stringExtra3 != null) {
                    decoratedBarcodeView.setStatusText(stringExtra3);
                }
                int intExtra2 = intent.getIntExtra("SCAN_TYPE", 0);
                String stringExtra4 = intent.getStringExtra("CHARACTER_SET");
                new h().c(enumMap);
                decoratedBarcodeView.f2897a.setCameraSettings(jVar2);
                BarcodeView barcodeView = decoratedBarcodeView.f2897a;
                q qVar = new q(0);
                qVar.f5447c = setNoneOf;
                qVar.f5448d = enumMap;
                qVar.f5449e = stringExtra4;
                qVar.f5446b = intExtra2;
                barcodeView.setDecoderFactory(qVar);
            }
            if (!intent.getBooleanExtra("BEEP_ENABLED", true)) {
                jVar.f5425i.f4442b = false;
            }
            if (intent.hasExtra("SHOW_MISSING_CAMERA_PERMISSION_DIALOG")) {
                boolean booleanExtra = intent.getBooleanExtra("SHOW_MISSING_CAMERA_PERMISSION_DIALOG", true);
                String stringExtra5 = intent.getStringExtra("MISSING_CAMERA_PERMISSION_DIALOG_MESSAGE");
                jVar.f5421e = booleanExtra;
                if (stringExtra5 == null) {
                    stringExtra5 = "";
                }
                jVar.f5422f = stringExtra5;
            }
            if (intent.hasExtra("TIMEOUT")) {
                z10 = true;
                jVar.f5426j.postDelayed(new g(jVar, 1), intent.getLongExtra("TIMEOUT", 0L));
            } else {
                z10 = true;
            }
            if (intent.getBooleanExtra("BARCODE_IMAGE_ENABLED", false)) {
                jVar.f5420d = z10;
            }
        }
        j jVar3 = this.f2895a;
        DecoratedBarcodeView decoratedBarcodeView2 = jVar3.f5418b;
        a2.d dVar2 = jVar3.f5427l;
        BarcodeView barcodeView2 = decoratedBarcodeView2.f2897a;
        k kVar = new k(6, decoratedBarcodeView2, dVar2, false);
        barcodeView2.A = 2;
        barcodeView2.B = kVar;
        barcodeView2.h();
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        j jVar = this.f2895a;
        jVar.f5423g = true;
        jVar.f5424h.a();
        jVar.f5426j.removeCallbacksAndMessages(null);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i7, KeyEvent keyEvent) {
        return this.f2896b.onKeyDown(i7, keyEvent) || super.onKeyDown(i7, keyEvent);
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        j jVar = this.f2895a;
        jVar.f5424h.a();
        BarcodeView barcodeView = jVar.f5418b.f2897a;
        g7.g cameraInstance = barcodeView.getCameraInstance();
        barcodeView.g();
        long jNanoTime = System.nanoTime();
        while (cameraInstance != null && !cameraInstance.f5975g && System.nanoTime() - jNanoTime <= 2000000000) {
            try {
                Thread.sleep(1L);
            } catch (InterruptedException unused) {
                return;
            }
        }
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i7, String[] strArr, int[] iArr) {
        j jVar = this.f2895a;
        jVar.getClass();
        if (i7 == 250) {
            if (iArr.length > 0 && iArr[0] == 0) {
                jVar.f5418b.f2897a.c();
                return;
            }
            Intent intent = new Intent("com.google.zxing.client.android.SCAN");
            intent.putExtra("MISSING_CAMERA_PERMISSION", true);
            jVar.f5417a.setResult(0, intent);
            if (jVar.f5421e) {
                jVar.b(jVar.f5422f);
            } else {
                jVar.a();
            }
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        j jVar = this.f2895a;
        DecoratedBarcodeView decoratedBarcodeView = jVar.f5418b;
        if (Build.VERSION.SDK_INT >= 23) {
            CaptureActivity captureActivity = jVar.f5417a;
            if (f.a(captureActivity, "android.permission.CAMERA") == 0) {
                decoratedBarcodeView.f2897a.c();
            } else if (!jVar.f5428m) {
                f.h(captureActivity, new String[]{"android.permission.CAMERA"}, 250);
                jVar.f5428m = true;
            }
        } else {
            decoratedBarcodeView.f2897a.c();
        }
        r5.f fVar = jVar.f5424h;
        if (!fVar.f11632c) {
            fVar.f11630a.registerReceiver(fVar.f11631b, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            fVar.f11632c = true;
        }
        Handler handler = fVar.f11633d;
        handler.removeCallbacksAndMessages(null);
        if (fVar.f11635f) {
            handler.postDelayed(fVar.f11634e, 300000L);
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("SAVED_ORIENTATION_LOCK", this.f2895a.f5419c);
    }
}
