package l;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import android.util.StateSet;
import n3.r;
import s.q;
import s.r0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b extends Drawable.ConstantState {
    public boolean A;
    public ColorFilter B;
    public boolean C;
    public ColorStateList D;
    public PorterDuff.Mode E;
    public boolean F;
    public boolean G;
    public int[][] H;
    public q I;
    public r0 J;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f7539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Resources f7540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f7541c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f7542d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f7543e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SparseArray f7544f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Drawable[] f7545g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f7546h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f7547i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f7548j;
    public Rect k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f7549l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f7550m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f7551n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f7552o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f7553p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f7554q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f7555r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f7556s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f7557t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f7558u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f7559v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f7560w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f7561x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f7562y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f7563z;

    public b(b bVar, e eVar, Resources resources) {
        this.f7547i = false;
        this.f7549l = false;
        this.f7560w = true;
        this.f7562y = 0;
        this.f7563z = 0;
        this.f7539a = eVar;
        this.f7540b = resources != null ? resources : bVar != null ? bVar.f7540b : null;
        int i7 = bVar != null ? bVar.f7541c : 0;
        int i10 = f.f7576m;
        i7 = resources != null ? resources.getDisplayMetrics().densityDpi : i7;
        i7 = i7 == 0 ? 160 : i7;
        this.f7541c = i7;
        if (bVar != null) {
            this.f7542d = bVar.f7542d;
            this.f7543e = bVar.f7543e;
            this.f7558u = true;
            this.f7559v = true;
            this.f7547i = bVar.f7547i;
            this.f7549l = bVar.f7549l;
            this.f7560w = bVar.f7560w;
            this.f7561x = bVar.f7561x;
            this.f7562y = bVar.f7562y;
            this.f7563z = bVar.f7563z;
            this.A = bVar.A;
            this.B = bVar.B;
            this.C = bVar.C;
            this.D = bVar.D;
            this.E = bVar.E;
            this.F = bVar.F;
            this.G = bVar.G;
            if (bVar.f7541c == i7) {
                if (bVar.f7548j) {
                    this.k = bVar.k != null ? new Rect(bVar.k) : null;
                    this.f7548j = true;
                }
                if (bVar.f7550m) {
                    this.f7551n = bVar.f7551n;
                    this.f7552o = bVar.f7552o;
                    this.f7553p = bVar.f7553p;
                    this.f7554q = bVar.f7554q;
                    this.f7550m = true;
                }
            }
            if (bVar.f7555r) {
                this.f7556s = bVar.f7556s;
                this.f7555r = true;
            }
            if (bVar.f7557t) {
                this.f7557t = true;
            }
            Drawable[] drawableArr = bVar.f7545g;
            this.f7545g = new Drawable[drawableArr.length];
            this.f7546h = bVar.f7546h;
            SparseArray sparseArray = bVar.f7544f;
            if (sparseArray != null) {
                this.f7544f = sparseArray.clone();
            } else {
                this.f7544f = new SparseArray(this.f7546h);
            }
            int i11 = this.f7546h;
            for (int i12 = 0; i12 < i11; i12++) {
                Drawable drawable = drawableArr[i12];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f7544f.put(i12, constantState);
                    } else {
                        this.f7545g[i12] = drawableArr[i12];
                    }
                }
            }
        } else {
            this.f7545g = new Drawable[10];
            this.f7546h = 0;
        }
        if (bVar != null) {
            this.H = bVar.H;
        } else {
            this.H = new int[this.f7545g.length][];
        }
        if (bVar != null) {
            this.I = bVar.I;
            this.J = bVar.J;
        } else {
            this.I = new q((Object) null);
            this.J = new r0(0);
        }
    }

    public final int a(Drawable drawable) {
        int i7 = this.f7546h;
        if (i7 >= this.f7545g.length) {
            int i10 = i7 + 10;
            Drawable[] drawableArr = new Drawable[i10];
            Drawable[] drawableArr2 = this.f7545g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i7);
            }
            this.f7545g = drawableArr;
            int[][] iArr = new int[i10][];
            System.arraycopy(this.H, 0, iArr, 0, i7);
            this.H = iArr;
        }
        drawable.mutate();
        drawable.setVisible(false, true);
        drawable.setCallback(this.f7539a);
        this.f7545g[i7] = drawable;
        this.f7546h++;
        this.f7543e = drawable.getChangingConfigurations() | this.f7543e;
        this.f7555r = false;
        this.f7557t = false;
        this.k = null;
        this.f7548j = false;
        this.f7550m = false;
        this.f7558u = false;
        return i7;
    }

    public final void b() {
        this.f7550m = true;
        c();
        int i7 = this.f7546h;
        Drawable[] drawableArr = this.f7545g;
        this.f7552o = -1;
        this.f7551n = -1;
        this.f7554q = 0;
        this.f7553p = 0;
        for (int i10 = 0; i10 < i7; i10++) {
            Drawable drawable = drawableArr[i10];
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (intrinsicWidth > this.f7551n) {
                this.f7551n = intrinsicWidth;
            }
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight > this.f7552o) {
                this.f7552o = intrinsicHeight;
            }
            int minimumWidth = drawable.getMinimumWidth();
            if (minimumWidth > this.f7553p) {
                this.f7553p = minimumWidth;
            }
            int minimumHeight = drawable.getMinimumHeight();
            if (minimumHeight > this.f7554q) {
                this.f7554q = minimumHeight;
            }
        }
    }

    public final void c() {
        SparseArray sparseArray = this.f7544f;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i7 = 0; i7 < size; i7++) {
                int iKeyAt = this.f7544f.keyAt(i7);
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f7544f.valueAt(i7);
                Drawable[] drawableArr = this.f7545g;
                Drawable drawableNewDrawable = constantState.newDrawable(this.f7540b);
                if (Build.VERSION.SDK_INT >= 23) {
                    r.V(drawableNewDrawable, this.f7561x);
                }
                Drawable drawableMutate = drawableNewDrawable.mutate();
                drawableMutate.setCallback(this.f7539a);
                drawableArr[iKeyAt] = drawableMutate;
            }
            this.f7544f = null;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        int i7 = this.f7546h;
        Drawable[] drawableArr = this.f7545g;
        for (int i10 = 0; i10 < i7; i10++) {
            Drawable drawable = drawableArr[i10];
            if (drawable == null) {
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f7544f.get(i10);
                if (constantState != null && constantState.canApplyTheme()) {
                    return true;
                }
            } else if (drawable.canApplyTheme()) {
                return true;
            }
        }
        return false;
    }

    public final Drawable d(int i7) {
        int iIndexOfKey;
        Drawable drawable = this.f7545g[i7];
        if (drawable != null) {
            return drawable;
        }
        SparseArray sparseArray = this.f7544f;
        if (sparseArray == null || (iIndexOfKey = sparseArray.indexOfKey(i7)) < 0) {
            return null;
        }
        Drawable drawableNewDrawable = ((Drawable.ConstantState) this.f7544f.valueAt(iIndexOfKey)).newDrawable(this.f7540b);
        if (Build.VERSION.SDK_INT >= 23) {
            r.V(drawableNewDrawable, this.f7561x);
        }
        Drawable drawableMutate = drawableNewDrawable.mutate();
        drawableMutate.setCallback(this.f7539a);
        this.f7545g[i7] = drawableMutate;
        this.f7544f.removeAt(iIndexOfKey);
        if (this.f7544f.size() == 0) {
            this.f7544f = null;
        }
        return drawableMutate;
    }

    public final int e(int i7) {
        Object obj;
        if (i7 < 0) {
            return 0;
        }
        r0 r0Var = this.J;
        Object obj2 = 0;
        int iA = t.a.a(r0Var.f12491c, i7, r0Var.f12489a);
        if (iA >= 0 && (obj = r0Var.f12490b[iA]) != s.r.f12488c) {
            obj2 = obj;
        }
        return ((Integer) obj2).intValue();
    }

    public final int f(int[] iArr) {
        int[][] iArr2 = this.H;
        int i7 = this.f7546h;
        for (int i10 = 0; i10 < i7; i10++) {
            if (StateSet.stateSetMatches(iArr2[i10], iArr)) {
                return i10;
            }
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f7542d | this.f7543e;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new e(this, null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new e(this, resources);
    }
}
