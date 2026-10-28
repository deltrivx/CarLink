package f5;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class k extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Matrix f5324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f5325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f5326c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f5327d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f5328e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f5329f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f5330g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f5331h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f5332i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Matrix f5333j;
    public String k;

    public k() {
        this.f5324a = new Matrix();
        this.f5325b = new ArrayList();
        this.f5326c = 0.0f;
        this.f5327d = 0.0f;
        this.f5328e = 0.0f;
        this.f5329f = 1.0f;
        this.f5330g = 1.0f;
        this.f5331h = 0.0f;
        this.f5332i = 0.0f;
        this.f5333j = new Matrix();
        this.k = null;
    }

    public k(k kVar, s.f fVar) {
        m iVar;
        this.f5324a = new Matrix();
        this.f5325b = new ArrayList();
        this.f5326c = 0.0f;
        this.f5327d = 0.0f;
        this.f5328e = 0.0f;
        this.f5329f = 1.0f;
        this.f5330g = 1.0f;
        this.f5331h = 0.0f;
        this.f5332i = 0.0f;
        Matrix matrix = new Matrix();
        this.f5333j = matrix;
        this.k = null;
        this.f5326c = kVar.f5326c;
        this.f5327d = kVar.f5327d;
        this.f5328e = kVar.f5328e;
        this.f5329f = kVar.f5329f;
        this.f5330g = kVar.f5330g;
        this.f5331h = kVar.f5331h;
        this.f5332i = kVar.f5332i;
        String str = kVar.k;
        this.k = str;
        if (str != null) {
            fVar.put(str, this);
        }
        matrix.set(kVar.f5333j);
        ArrayList arrayList = kVar.f5325b;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            Object obj = arrayList.get(i7);
            if (obj instanceof k) {
                this.f5325b.add(new k((k) obj, fVar));
            } else {
                if (obj instanceof j) {
                    j jVar = (j) obj;
                    j jVar2 = new j(jVar);
                    jVar2.f5315e = 0.0f;
                    jVar2.f5317g = 1.0f;
                    jVar2.f5318h = 1.0f;
                    jVar2.f5319i = 0.0f;
                    jVar2.f5320j = 1.0f;
                    jVar2.k = 0.0f;
                    jVar2.f5321l = Paint.Cap.BUTT;
                    jVar2.f5322m = Paint.Join.MITER;
                    jVar2.f5323n = 4.0f;
                    jVar2.f5314d = jVar.f5314d;
                    jVar2.f5315e = jVar.f5315e;
                    jVar2.f5317g = jVar.f5317g;
                    jVar2.f5316f = jVar.f5316f;
                    jVar2.f5336c = jVar.f5336c;
                    jVar2.f5318h = jVar.f5318h;
                    jVar2.f5319i = jVar.f5319i;
                    jVar2.f5320j = jVar.f5320j;
                    jVar2.k = jVar.k;
                    jVar2.f5321l = jVar.f5321l;
                    jVar2.f5322m = jVar.f5322m;
                    jVar2.f5323n = jVar.f5323n;
                    iVar = jVar2;
                } else {
                    if (!(obj instanceof i)) {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    iVar = new i((i) obj);
                }
                this.f5325b.add(iVar);
                Object obj2 = iVar.f5335b;
                if (obj2 != null) {
                    fVar.put(obj2, iVar);
                }
            }
        }
    }

    @Override // f5.l
    public final boolean a() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f5325b;
            if (i7 >= arrayList.size()) {
                return false;
            }
            if (((l) arrayList.get(i7)).a()) {
                return true;
            }
            i7++;
        }
    }

    @Override // f5.l
    public final boolean b(int[] iArr) {
        int i7 = 0;
        boolean zB = false;
        while (true) {
            ArrayList arrayList = this.f5325b;
            if (i7 >= arrayList.size()) {
                return zB;
            }
            zB |= ((l) arrayList.get(i7)).b(iArr);
            i7++;
        }
    }

    public final void c() {
        Matrix matrix = this.f5333j;
        matrix.reset();
        matrix.postTranslate(-this.f5327d, -this.f5328e);
        matrix.postScale(this.f5329f, this.f5330g);
        matrix.postRotate(this.f5326c, 0.0f, 0.0f);
        matrix.postTranslate(this.f5331h + this.f5327d, this.f5332i + this.f5328e);
    }

    public String getGroupName() {
        return this.k;
    }

    public Matrix getLocalMatrix() {
        return this.f5333j;
    }

    public float getPivotX() {
        return this.f5327d;
    }

    public float getPivotY() {
        return this.f5328e;
    }

    public float getRotation() {
        return this.f5326c;
    }

    public float getScaleX() {
        return this.f5329f;
    }

    public float getScaleY() {
        return this.f5330g;
    }

    public float getTranslateX() {
        return this.f5331h;
    }

    public float getTranslateY() {
        return this.f5332i;
    }

    public void setPivotX(float f10) {
        if (f10 != this.f5327d) {
            this.f5327d = f10;
            c();
        }
    }

    public void setPivotY(float f10) {
        if (f10 != this.f5328e) {
            this.f5328e = f10;
            c();
        }
    }

    public void setRotation(float f10) {
        if (f10 != this.f5326c) {
            this.f5326c = f10;
            c();
        }
    }

    public void setScaleX(float f10) {
        if (f10 != this.f5329f) {
            this.f5329f = f10;
            c();
        }
    }

    public void setScaleY(float f10) {
        if (f10 != this.f5330g) {
            this.f5330g = f10;
            c();
        }
    }

    public void setTranslateX(float f10) {
        if (f10 != this.f5331h) {
            this.f5331h = f10;
            c();
        }
    }

    public void setTranslateY(float f10) {
        if (f10 != this.f5332i) {
            this.f5332i = f10;
            c();
        }
    }
}
