package wb;

import e2.g0;
import i9.b0;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class i extends u8.h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f14296c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f14297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f14298b;

    public i(int i7) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x007c, code lost:
    
        if (i9.b0.c(r0).add(r7) == false) goto L26;
     */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean add(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.f14298b
            r1 = 1
            if (r0 != 0) goto L9
            r6.f14297a = r7
            goto L7f
        L9:
            r2 = 0
            if (r0 != r1) goto L21
            java.lang.Object r0 = r6.f14297a
            boolean r0 = i9.l.a(r0, r7)
            if (r0 == 0) goto L15
            goto L7e
        L15:
            java.lang.Object r0 = r6.f14297a
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r2] = r0
            r3[r1] = r7
            r6.f14297a = r3
            goto L7f
        L21:
            r3 = 5
            if (r0 >= r3) goto L6d
            java.lang.Object r0 = r6.f14297a
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>"
            i9.l.c(r0, r3)
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            boolean r3 = u8.l.l0(r7, r0)
            if (r3 == 0) goto L34
            goto L7e
        L34:
            int r3 = r6.f14298b
            r4 = 4
            if (r3 != r4) goto L5c
            int r3 = r0.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r3)
            java.lang.String r3 = "elements"
            i9.l.e(r0, r3)
            java.util.LinkedHashSet r3 = new java.util.LinkedHashSet
            int r4 = r0.length
            int r4 = u8.c0.S0(r4)
            r3.<init>(r4)
            int r4 = r0.length
        L4e:
            if (r2 >= r4) goto L58
            r5 = r0[r2]
            r3.add(r5)
            int r2 = r2 + 1
            goto L4e
        L58:
            r3.add(r7)
            goto L6a
        L5c:
            int r3 = r3 + r1
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r0, r3)
            java.lang.String r0 = "copyOf(...)"
            i9.l.d(r3, r0)
            int r0 = r3.length
            int r0 = r0 - r1
            r3[r0] = r7
        L6a:
            r6.f14297a = r3
            goto L7f
        L6d:
            java.lang.Object r0 = r6.f14297a
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>"
            i9.l.c(r0, r3)
            java.util.Set r0 = i9.b0.c(r0)
            boolean r7 = r0.add(r7)
            if (r7 != 0) goto L7f
        L7e:
            return r2
        L7f:
            int r7 = r6.f14298b
            int r7 = r7 + r1
            r6.f14298b = r7
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: wb.i.add(java.lang.Object):boolean");
    }

    @Override // u8.h
    public final int c() {
        return this.f14298b;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f14297a = null;
        this.f14298b = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (c() == 0) {
            return false;
        }
        if (c() == 1) {
            return i9.l.a(this.f14297a, obj);
        }
        if (c() < 5) {
            Object obj2 = this.f14297a;
            i9.l.c(obj2, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            return u8.l.l0(obj, (Object[]) obj2);
        }
        Object obj3 = this.f14297a;
        i9.l.c(obj3, "null cannot be cast to non-null type kotlin.collections.Set<T of org.jetbrains.kotlin.utils.SmartSet>");
        return ((Set) obj3).contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i7 = this.f14298b;
        if (i7 == 0) {
            return Collections.EMPTY_SET.iterator();
        }
        if (i7 == 1) {
            return new h(0, this.f14297a);
        }
        if (i7 < 5) {
            Object obj = this.f14297a;
            i9.l.c(obj, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            return new g0((Object[]) obj);
        }
        Object obj2 = this.f14297a;
        i9.l.c(obj2, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
        return b0.c(obj2).iterator();
    }
}
