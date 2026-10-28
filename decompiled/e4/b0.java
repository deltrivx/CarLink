package e4;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;
import java.util.ConcurrentModificationException;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4318b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4319c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f4320d;

    public b0() {
        if (kb.d.f7503e == null) {
            kb.d.f7503e = new kb.d(28);
        }
    }

    public int a(int i7) {
        if (i7 < this.f4319c) {
            return ((ByteBuffer) this.f4320d).getShort(this.f4318b + i7);
        }
        return 0;
    }

    public void b() {
        if (((v8.e) this.f4320d).f13675h != this.f4319c) {
            throw new ConcurrentModificationException();
        }
    }

    public abstract Object c(View view);

    public abstract void d(View view, Object obj);

    public void e() {
        while (true) {
            int i7 = this.f4317a;
            v8.e eVar = (v8.e) this.f4320d;
            if (i7 >= eVar.f13673f || eVar.f13670c[i7] >= 0) {
                return;
            } else {
                this.f4317a = i7 + 1;
            }
        }
    }

    public void f(View view, Object obj) {
        Object tag;
        b bVar;
        if (Build.VERSION.SDK_INT >= this.f4318b) {
            d(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.f4318b) {
            tag = c(view);
        } else {
            tag = view.getTag(this.f4317a);
            if (!((Class) this.f4320d).isInstance(tag)) {
                tag = null;
            }
        }
        if (h(tag, obj)) {
            View.AccessibilityDelegate accessibilityDelegateD = l0.d(view);
            if (accessibilityDelegateD == null) {
                bVar = null;
            } else {
                bVar = accessibilityDelegateD instanceof a ? ((a) accessibilityDelegateD).f4308a : new b(accessibilityDelegateD);
            }
            if (bVar == null) {
                bVar = new b();
            }
            l0.j(view, bVar);
            view.setTag(this.f4317a, obj);
            l0.g(view, this.f4319c);
        }
    }

    public abstract boolean h(Object obj, Object obj2);

    public boolean hasNext() {
        return this.f4317a < ((v8.e) this.f4320d).f13673f;
    }

    public void remove() {
        v8.e eVar = (v8.e) this.f4320d;
        b();
        if (this.f4318b == -1) {
            throw new IllegalStateException("Call next() before removing element from the iterator.");
        }
        eVar.c();
        eVar.n(this.f4318b);
        this.f4318b = -1;
        this.f4319c = eVar.f13675h;
    }
}
