package e2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f4168a;

    public g() {
        this.f4168a = new ArrayList(32);
    }

    public g(int i7) {
        this.f4168a = new ArrayList(i7);
    }

    public void a(Object obj) {
        this.f4168a.add(obj);
    }

    public void b(Object obj) {
        ArrayList arrayList = this.f4168a;
        if (obj == null) {
            return;
        }
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length > 0) {
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                Collections.addAll(arrayList, objArr);
                return;
            }
            return;
        }
        if (obj instanceof Collection) {
            arrayList.addAll((Collection) obj);
            return;
        }
        if (obj instanceof Iterable) {
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        } else {
            if (!(obj instanceof Iterator)) {
                throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
            }
            Iterator it2 = (Iterator) obj;
            while (it2.hasNext()) {
                arrayList.add(it2.next());
            }
        }
    }

    public void c() {
        this.f4168a.add(k.f4210c);
    }

    public void d(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f4168a.add(new t(f10, f11, f12, f13, f14, f15));
    }

    public void e(float f10) {
        this.f4168a.add(new m(f10));
    }

    public void f(float f10) {
        this.f4168a.add(new u(f10));
    }

    public void g(float f10, float f11) {
        this.f4168a.add(new n(f10, f11));
    }

    public void h(float f10, float f11) {
        this.f4168a.add(new v(f10, f11));
    }

    public void i(float f10, float f11) {
        this.f4168a.add(new o(f10, f11));
    }

    public void j(float f10, float f11, float f12, float f13) {
        this.f4168a.add(new y(f10, f11, f12, f13));
    }

    public void k(float f10) {
        this.f4168a.add(new b0(f10));
    }

    public void l(float f10) {
        this.f4168a.add(new a0(f10));
    }
}
