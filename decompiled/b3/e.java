package b3;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e implements Appendable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringBuilder f1320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f1321b;

    public e() {
        this.f1320a = new StringBuilder(16);
        new ArrayList();
        this.f1321b = new ArrayList();
        new ArrayList();
    }

    public e(h hVar) {
        this();
        a(hVar);
    }

    public final void a(h hVar) {
        StringBuilder sb2 = this.f1320a;
        int length = sb2.length();
        sb2.append(hVar.f1353b);
        List list = hVar.f1352a;
        if (list != null) {
            int size = list.size();
            for (int i7 = 0; i7 < size; i7++) {
                f fVar = (f) list.get(i7);
                this.f1321b.add(new d(fVar.f1324a, fVar.f1325b + length, fVar.f1326c + length, fVar.f1327d));
            }
        }
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c10) {
        this.f1320a.append(c10);
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        if (charSequence instanceof h) {
            a((h) charSequence);
            return this;
        }
        this.f1320a.append(charSequence);
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i7, int i10) {
        if (charSequence instanceof h) {
            b((h) charSequence, i7, i10);
            return this;
        }
        this.f1320a.append(charSequence, i7, i10);
        return this;
    }

    public final void b(h hVar, int i7, int i10) {
        StringBuilder sb2 = this.f1320a;
        int length = sb2.length();
        sb2.append((CharSequence) hVar.f1353b, i7, i10);
        List listA = i.a(hVar, i7, i10, null);
        if (listA != null) {
            int size = listA.size();
            for (int i11 = 0; i11 < size; i11++) {
                f fVar = (f) listA.get(i11);
                this.f1321b.add(new d(fVar.f1324a, fVar.f1325b + length, fVar.f1326c + length, fVar.f1327d));
            }
        }
    }

    public final h c() {
        StringBuilder sb2 = this.f1320a;
        String string = sb2.toString();
        ArrayList arrayList = this.f1321b;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            d dVar = (d) arrayList.get(i7);
            int length = sb2.length();
            int i10 = dVar.f1317c;
            if (i10 != Integer.MIN_VALUE) {
                length = i10;
            }
            if (length == Integer.MIN_VALUE) {
                h3.a.b("Item.end should be set first");
            }
            arrayList2.add(new f(dVar.f1315a, dVar.f1316b, length, dVar.f1318d));
        }
        return new h(string, arrayList2);
    }
}
