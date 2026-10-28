package hc;

import cc.q0;
import cc.r0;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f6540b = AtomicIntegerFieldUpdater.newUpdater(u.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public q0[] f6541a;

    public final void a(q0 q0Var) {
        q0Var.e((r0) this);
        q0[] q0VarArr = this.f6541a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f6540b;
        if (q0VarArr == null) {
            q0VarArr = new q0[4];
            this.f6541a = q0VarArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= q0VarArr.length) {
            Object[] objArrCopyOf = Arrays.copyOf(q0VarArr, atomicIntegerFieldUpdater.get(this) * 2);
            i9.l.d(objArrCopyOf, "copyOf(...)");
            q0VarArr = (q0[]) objArrCopyOf;
            this.f6541a = q0VarArr;
        }
        int i7 = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i7 + 1);
        q0VarArr[i7] = q0Var;
        q0Var.f2660b = i7;
        d(i7);
    }

    public final void b(q0 q0Var) {
        synchronized (this) {
            if (q0Var.b() != null) {
                c(q0Var.f2660b);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0045  */
    /* JADX WARN: Code duplicated, block: B:14:0x0052  */
    /* JADX WARN: Code duplicated, block: B:17:0x0063  */
    /* JADX WARN: Code duplicated, block: B:21:0x0075 A[LOOP:0: B:9:0x003a->B:21:0x0075, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x007a A[EDGE_INSN: B:24:0x007a->B:22:0x007a BREAK  A[LOOP:0: B:9:0x003a->B:21:0x0075], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x007a A[EDGE_INSN: B:25:0x007a->B:22:0x007a BREAK  A[LOOP:0: B:9:0x003a->B:21:0x0075], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:? A[SYNTHETIC] */
    public final q0 c(int i7) {
        int i10;
        int i11;
        Object[] objArr;
        int i12;
        Comparable comparable;
        Comparable comparable2;
        Comparable comparable3;
        Object obj;
        Object[] objArr2 = this.f6541a;
        i9.l.b(objArr2);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f6540b;
        atomicIntegerFieldUpdater.set(this, atomicIntegerFieldUpdater.get(this) - 1);
        if (i7 < atomicIntegerFieldUpdater.get(this)) {
            e(i7, atomicIntegerFieldUpdater.get(this));
            int i13 = (i7 - 1) / 2;
            if (i7 > 0) {
                q0 q0Var = objArr2[i7];
                i9.l.b(q0Var);
                Object obj2 = objArr2[i13];
                i9.l.b(obj2);
                if (q0Var.compareTo(obj2) < 0) {
                    e(i7, i13);
                    d(i13);
                } else {
                    while (true) {
                        i10 = i7 * 2;
                        i11 = i10 + 1;
                        if (i11 >= atomicIntegerFieldUpdater.get(this)) {
                            break;
                        }
                        objArr = this.f6541a;
                        i9.l.b(objArr);
                        i12 = i10 + 2;
                        if (i12 < atomicIntegerFieldUpdater.get(this)) {
                            comparable3 = objArr[i12];
                            i9.l.b(comparable3);
                            obj = objArr[i11];
                            i9.l.b(obj);
                            if (comparable3.compareTo(obj) >= 0) {
                                i12 = i11;
                            }
                        } else {
                            i12 = i11;
                        }
                        comparable = objArr[i7];
                        i9.l.b(comparable);
                        comparable2 = objArr[i12];
                        i9.l.b(comparable2);
                        if (comparable.compareTo(comparable2) <= 0) {
                            break;
                        }
                        e(i7, i12);
                        i7 = i12;
                    }
                }
            } else {
                while (true) {
                    i10 = i7 * 2;
                    i11 = i10 + 1;
                    if (i11 >= atomicIntegerFieldUpdater.get(this)) {
                        break;
                        break;
                    }
                    objArr = this.f6541a;
                    i9.l.b(objArr);
                    i12 = i10 + 2;
                    if (i12 < atomicIntegerFieldUpdater.get(this)) {
                        comparable3 = objArr[i12];
                        i9.l.b(comparable3);
                        obj = objArr[i11];
                        i9.l.b(obj);
                        if (comparable3.compareTo(obj) >= 0) {
                            i12 = i11;
                        }
                    } else {
                        i12 = i11;
                    }
                    comparable = objArr[i7];
                    i9.l.b(comparable);
                    comparable2 = objArr[i12];
                    i9.l.b(comparable2);
                    if (comparable.compareTo(comparable2) <= 0) {
                        break;
                        break;
                    }
                    e(i7, i12);
                    i7 = i12;
                }
            }
        }
        q0 q0Var2 = objArr2[atomicIntegerFieldUpdater.get(this)];
        i9.l.b(q0Var2);
        q0Var2.e(null);
        q0Var2.f2660b = -1;
        objArr2[atomicIntegerFieldUpdater.get(this)] = null;
        return q0Var2;
    }

    public final void d(int i7) {
        while (i7 > 0) {
            q0[] q0VarArr = this.f6541a;
            i9.l.b(q0VarArr);
            int i10 = (i7 - 1) / 2;
            q0 q0Var = q0VarArr[i10];
            i9.l.b(q0Var);
            q0 q0Var2 = q0VarArr[i7];
            i9.l.b(q0Var2);
            if (q0Var.compareTo(q0Var2) <= 0) {
                return;
            }
            e(i7, i10);
            i7 = i10;
        }
    }

    public final void e(int i7, int i10) {
        q0[] q0VarArr = this.f6541a;
        i9.l.b(q0VarArr);
        q0 q0Var = q0VarArr[i10];
        i9.l.b(q0Var);
        q0 q0Var2 = q0VarArr[i7];
        i9.l.b(q0Var2);
        q0VarArr[i7] = q0Var;
        q0VarArr[i10] = q0Var2;
        q0Var.f2660b = i7;
        q0Var2.f2660b = i10;
    }
}
