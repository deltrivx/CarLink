package b1;

import android.content.Context;
import android.view.ViewGroup;
import com.baidu.carlifevehicle.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class i extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f1160b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f1161c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final android.support.v4.media.session.r f1162d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1163e;

    public i(Context context) {
        super(context);
        this.f1159a = 5;
        ArrayList arrayList = new ArrayList();
        this.f1160b = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f1161c = arrayList2;
        this.f1162d = new android.support.v4.media.session.r(2);
        setClipChildren(false);
        k kVar = new k(context);
        addView(kVar);
        arrayList.add(kVar);
        arrayList2.add(kVar);
        this.f1163e = 1;
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    public final k a(j jVar) {
        android.support.v4.media.session.r rVar = this.f1162d;
        LinkedHashMap linkedHashMap = (LinkedHashMap) rVar.f604b;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) rVar.f604b;
        LinkedHashMap linkedHashMap3 = (LinkedHashMap) rVar.f605c;
        k kVar = (k) linkedHashMap.get(jVar);
        if (kVar != null) {
            return kVar;
        }
        ArrayList arrayList = this.f1161c;
        i9.l.e(arrayList, "<this>");
        k kVar2 = (k) (arrayList.isEmpty() ? null : arrayList.remove(0));
        if (kVar2 == null) {
            int i7 = this.f1163e;
            ArrayList arrayList2 = this.f1160b;
            if (i7 > n3.l.A(arrayList2)) {
                kVar2 = new k(getContext());
                addView(kVar2);
                arrayList2.add(kVar2);
            } else {
                kVar2 = (k) arrayList2.get(this.f1163e);
                j jVar2 = (j) linkedHashMap3.get(kVar2);
                if (jVar2 != null) {
                    jVar2.D();
                    k kVar3 = (k) linkedHashMap2.get(jVar2);
                    if (kVar3 != null) {
                    }
                    linkedHashMap2.remove(jVar2);
                    kVar2.c();
                }
            }
            int i10 = this.f1163e;
            if (i10 < this.f1159a - 1) {
                this.f1163e = i10 + 1;
            } else {
                this.f1163e = 0;
            }
        }
        linkedHashMap2.put(jVar, kVar2);
        linkedHashMap3.put(kVar2, jVar);
        return kVar2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }
}
