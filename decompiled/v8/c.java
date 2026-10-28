package v8;

import e4.b0;
import i9.l;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c extends b0 implements Iterator, j9.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f13663e;

    public c(e eVar, int i7) {
        this.f13663e = i7;
        l.e(eVar, "map");
        this.f4320d = eVar;
        this.f4318b = -1;
        this.f4319c = eVar.f13675h;
        e();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f13663e) {
            case 0:
                b();
                int i7 = this.f4317a;
                e eVar = (e) this.f4320d;
                if (i7 >= eVar.f13673f) {
                    throw new NoSuchElementException();
                }
                this.f4317a = i7 + 1;
                this.f4318b = i7;
                d dVar = new d(eVar, i7);
                e();
                return dVar;
            case 1:
                b();
                int i10 = this.f4317a;
                e eVar2 = (e) this.f4320d;
                if (i10 >= eVar2.f13673f) {
                    throw new NoSuchElementException();
                }
                this.f4317a = i10 + 1;
                this.f4318b = i10;
                Object obj = eVar2.f13668a[i10];
                e();
                return obj;
            default:
                b();
                int i11 = this.f4317a;
                e eVar3 = (e) this.f4320d;
                if (i11 >= eVar3.f13673f) {
                    throw new NoSuchElementException();
                }
                this.f4317a = i11 + 1;
                this.f4318b = i11;
                Object[] objArr = eVar3.f13669b;
                l.b(objArr);
                Object obj2 = objArr[this.f4318b];
                e();
                return obj2;
        }
    }
}
