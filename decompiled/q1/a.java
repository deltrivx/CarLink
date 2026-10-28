package q1;

import f1.n0;
import java.util.ArrayList;
import pa.l;
import pa.m;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f10577a;

    public a(int i7) {
        switch (i7) {
            case 1:
                this.f10577a = new ArrayList();
                break;
            default:
                this.f10577a = new ArrayList();
                break;
        }
    }

    public boolean a(n0 n0Var, Object obj) {
        ArrayList arrayList = n0Var.f5052a;
        if (arrayList == null) {
            return true;
        }
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            Object obj2 = arrayList.get(i7);
            if (obj2 instanceof f1.a) {
                if (obj2.equals(obj)) {
                    return true;
                }
            } else {
                if (!(obj2 instanceof n0)) {
                    throw new IllegalStateException(("Unexpected child source info " + obj2).toString());
                }
                if (a((n0) obj2, obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // pa.m
    public void b() {
        f((String[]) this.f10577a.toArray(new String[0]));
    }

    @Override // pa.m
    public void c(bb.f fVar) {
    }

    @Override // pa.m
    public l d(wa.b bVar) {
        return null;
    }

    public void e(n0 n0Var, Object obj) {
    }

    public abstract void f(String[] strArr);

    @Override // pa.m
    public void h(Object obj) {
        if (obj instanceof String) {
            this.f10577a.add((String) obj);
        }
    }

    @Override // pa.m
    public void k(wa.b bVar, wa.e eVar) {
    }
}
