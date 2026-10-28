package k2;

import android.os.Build;
import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f7229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseLongArray f7230b = new SparseLongArray();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SparseBooleanArray f7231c = new SparseBooleanArray();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f7232d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f7233e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f7234f = -1;

    /* JADX WARN: Code duplicated, block: B:19:0x0044  */
    /* JADX WARN: Code duplicated, block: B:72:0x0169  */
    /* JADX WARN: Code duplicated, block: B:74:0x016c  */
    /* JADX WARN: Code duplicated, block: B:76:0x016f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x0171 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x0173  */
    /* JADX WARN: Code duplicated, block: B:79:0x0176  */
    /* JADX WARN: Code duplicated, block: B:80:0x0179  */
    /* JADX WARN: Code duplicated, block: B:81:0x017c  */
    /* JADX WARN: Code duplicated, block: B:82:0x017f  */
    /* JADX WARN: Code duplicated, block: B:85:0x0191  */
    /* JADX WARN: Code duplicated, block: B:90:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:94:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:96:0x020c  */
    public final android.support.v4.media.session.r a(MotionEvent motionEvent, r2.u uVar) {
        long j5;
        int i7;
        long jValueAt;
        float f10;
        long j10;
        long jX;
        long jL;
        int toolType;
        int i10;
        int historySize;
        int i11;
        long jFloatToRawIntBits;
        float historicalX;
        int actionMasked = motionEvent.getActionMasked();
        SparseLongArray sparseLongArray = this.f7230b;
        SparseBooleanArray sparseBooleanArray = this.f7231c;
        int i12 = 3;
        if (actionMasked != 3) {
            int i13 = 4;
            if (actionMasked != 4) {
                if (motionEvent.getPointerCount() == 1) {
                    int toolType2 = motionEvent.getToolType(0);
                    int source = motionEvent.getSource();
                    if (toolType2 != this.f7233e || source != this.f7234f) {
                        this.f7233e = toolType2;
                        this.f7234f = source;
                        sparseBooleanArray.clear();
                        sparseLongArray.clear();
                    }
                }
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 == 0 || actionMasked2 == 5) {
                    j5 = 1;
                    int actionIndex = motionEvent.getActionIndex();
                    int pointerId = motionEvent.getPointerId(actionIndex);
                    if (sparseLongArray.indexOfKey(pointerId) < 0) {
                        long j11 = this.f7229a;
                        this.f7229a = j11 + 1;
                        sparseLongArray.put(pointerId, j11);
                        if (motionEvent.getToolType(actionIndex) == 3) {
                            sparseBooleanArray.put(pointerId, true);
                        }
                    }
                } else if (actionMasked2 != 9) {
                    j5 = 1;
                } else {
                    int pointerId2 = motionEvent.getPointerId(0);
                    if (sparseLongArray.indexOfKey(pointerId2) < 0) {
                        long j12 = this.f7229a;
                        j5 = 1;
                        this.f7229a = j12 + 1;
                        sparseLongArray.put(pointerId2, j12);
                    } else {
                        j5 = 1;
                    }
                }
                boolean z10 = actionMasked == 9 || actionMasked == 7 || actionMasked == 10;
                boolean z11 = actionMasked == 8;
                if (z10) {
                    i7 = 1;
                    sparseBooleanArray.put(motionEvent.getPointerId(motionEvent.getActionIndex()), true);
                } else {
                    i7 = 1;
                }
                int actionIndex2 = actionMasked != i7 ? actionMasked != 6 ? -1 : motionEvent.getActionIndex() : 0;
                ArrayList arrayList = this.f7232d;
                arrayList.clear();
                int pointerCount = motionEvent.getPointerCount();
                int i14 = 0;
                while (i14 < pointerCount) {
                    boolean z12 = (z10 || i14 == actionIndex2 || (z11 && motionEvent.getButtonState() == 0)) ? false : true;
                    int pointerId3 = motionEvent.getPointerId(i14);
                    int iIndexOfKey = sparseLongArray.indexOfKey(pointerId3);
                    if (iIndexOfKey >= 0) {
                        jValueAt = sparseLongArray.valueAt(iIndexOfKey);
                    } else {
                        long j13 = this.f7229a;
                        this.f7229a = j13 + j5;
                        sparseLongArray.put(pointerId3, j13);
                        jValueAt = j13;
                    }
                    float pressure = motionEvent.getPressure(i14);
                    long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(motionEvent.getY(i14))) & 4294967295L) | (((long) Float.floatToRawIntBits(motionEvent.getX(i14))) << 32);
                    long jA = x1.b.a(jFloatToRawIntBits2, 0.0f, i12);
                    if (i14 == 0) {
                        f10 = 0.0f;
                        jX = (((long) Float.floatToRawIntBits(motionEvent.getRawY())) & 4294967295L) | (((long) Float.floatToRawIntBits(motionEvent.getRawX())) << 32);
                        jL = uVar.L(jX);
                    } else {
                        f10 = 0.0f;
                        if (Build.VERSION.SDK_INT >= 29) {
                            jX = (((long) Float.floatToRawIntBits(motionEvent.getRawY(i14))) & 4294967295L) | (((long) Float.floatToRawIntBits(motionEvent.getRawX(i14))) << 32);
                            jL = uVar.L(jX);
                        } else {
                            j10 = jFloatToRawIntBits2;
                            jX = uVar.x(jFloatToRawIntBits2);
                        }
                        toolType = motionEvent.getToolType(i14);
                        if (toolType == 0) {
                            i10 = 0;
                        } else if (toolType != 1) {
                            i10 = 1;
                        } else if (toolType != 2) {
                            i10 = 3;
                        } else if (toolType != i12) {
                            i10 = 2;
                        } else if (toolType != i13) {
                            i10 = 0;
                        } else {
                            i10 = 4;
                        }
                        ArrayList arrayList2 = new ArrayList(motionEvent.getHistorySize());
                        historySize = motionEvent.getHistorySize();
                        i11 = 0;
                        while (i11 < historySize) {
                            historicalX = motionEvent.getHistoricalX(i14, i11);
                            float historicalY = motionEvent.getHistoricalY(i14, i11);
                            if ((Float.floatToRawIntBits(historicalX) & Integer.MAX_VALUE) >= 2139095040 && (Float.floatToRawIntBits(historicalY) & Integer.MAX_VALUE) < 2139095040) {
                                long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(historicalX)) << 32) | (((long) Float.floatToRawIntBits(historicalY)) & 4294967295L);
                                arrayList2.add(new c(motionEvent.getHistoricalEventTime(i11), jFloatToRawIntBits3, jFloatToRawIntBits3));
                            }
                            i11++;
                            actionIndex2 = actionIndex2;
                        }
                        int i15 = actionIndex2;
                        if (motionEvent.getActionMasked() == 8) {
                            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(motionEvent.getAxisValue(10))) << 32) | (((long) Float.floatToRawIntBits((-motionEvent.getAxisValue(9)) + f10)) & 4294967295L);
                        } else {
                            jFloatToRawIntBits = 0;
                        }
                        arrayList.add(new x(jValueAt, motionEvent.getEventTime(), jX, j10, z12, pressure, i10, sparseBooleanArray.get(motionEvent.getPointerId(i14), false), arrayList2, jFloatToRawIntBits, jA));
                        i14++;
                        actionIndex2 = i15;
                        z11 = z11;
                        z10 = z10;
                        i12 = 3;
                        i13 = 4;
                    }
                    j10 = jL;
                    toolType = motionEvent.getToolType(i14);
                    if (toolType == 0) {
                        i10 = 0;
                    } else if (toolType != 1) {
                        i10 = 1;
                    } else if (toolType != 2) {
                        i10 = 3;
                    } else if (toolType != i12) {
                        i10 = 2;
                    } else if (toolType != i13) {
                        i10 = 0;
                    } else {
                        i10 = 4;
                    }
                    ArrayList arrayList3 = new ArrayList(motionEvent.getHistorySize());
                    historySize = motionEvent.getHistorySize();
                    i11 = 0;
                    while (i11 < historySize) {
                        historicalX = motionEvent.getHistoricalX(i14, i11);
                        float historicalY2 = motionEvent.getHistoricalY(i14, i11);
                        if ((Float.floatToRawIntBits(historicalX) & Integer.MAX_VALUE) >= 2139095040) {
                        }
                        i11++;
                        actionIndex2 = actionIndex2;
                    }
                    int i16 = actionIndex2;
                    if (motionEvent.getActionMasked() == 8) {
                        jFloatToRawIntBits = (((long) Float.floatToRawIntBits(motionEvent.getAxisValue(10))) << 32) | (((long) Float.floatToRawIntBits((-motionEvent.getAxisValue(9)) + f10)) & 4294967295L);
                    } else {
                        jFloatToRawIntBits = 0;
                    }
                    arrayList.add(new x(jValueAt, motionEvent.getEventTime(), jX, j10, z12, pressure, i10, sparseBooleanArray.get(motionEvent.getPointerId(i14), false), arrayList3, jFloatToRawIntBits, jA));
                    i14++;
                    actionIndex2 = i16;
                    z11 = z11;
                    z10 = z10;
                    i12 = 3;
                    i13 = 4;
                }
                int actionMasked3 = motionEvent.getActionMasked();
                if (actionMasked3 == 1 || actionMasked3 == 6) {
                    int pointerId4 = motionEvent.getPointerId(motionEvent.getActionIndex());
                    if (!sparseBooleanArray.get(pointerId4, false)) {
                        sparseLongArray.delete(pointerId4);
                        sparseBooleanArray.delete(pointerId4);
                    }
                }
                if (sparseLongArray.size() > motionEvent.getPointerCount()) {
                    for (int size = sparseLongArray.size() - 1; -1 < size; size--) {
                        int iKeyAt = sparseLongArray.keyAt(size);
                        int pointerCount2 = motionEvent.getPointerCount();
                        int i17 = 0;
                        while (true) {
                            if (i17 >= pointerCount2) {
                                sparseLongArray.removeAt(size);
                                sparseBooleanArray.delete(iKeyAt);
                                break;
                            }
                            if (motionEvent.getPointerId(i17) == iKeyAt) {
                                break;
                            }
                            i17++;
                        }
                    }
                }
                motionEvent.getEventTime();
                return new android.support.v4.media.session.r(14, arrayList, motionEvent);
            }
        }
        sparseLongArray.clear();
        sparseBooleanArray.clear();
        return null;
    }
}
