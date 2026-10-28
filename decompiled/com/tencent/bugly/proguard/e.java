package com.tencent.bugly.proguard;

import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e extends d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static HashMap<String, byte[]> f3406h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static HashMap<String, HashMap<String, byte[]>> f3407i;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected g f3408g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f3409j;

    public e() {
        g gVar = new g();
        this.f3408g = gVar;
        this.f3409j = 0;
        gVar.f3418a = (short) 2;
    }

    @Override // com.tencent.bugly.proguard.d, com.tencent.bugly.proguard.n0
    public final <T> void a(String str, T t2) {
        if (str.startsWith(".")) {
            throw new IllegalArgumentException("put name can not startwith . , now is ".concat(str));
        }
        super.a(str, t2);
    }

    @Override // com.tencent.bugly.proguard.d, com.tencent.bugly.proguard.n0
    public final void a(byte[] bArr) {
        if (bArr.length < 4) {
            throw new IllegalArgumentException("decode package must include size head");
        }
        try {
            k kVar = new k(bArr, (byte) 0);
            kVar.a(this.f3458c);
            this.f3408g.a(kVar);
            g gVar = this.f3408g;
            if (gVar.f3418a == 3) {
                k kVar2 = new k(gVar.f3424g);
                kVar2.a(this.f3458c);
                if (f3406h == null) {
                    HashMap<String, byte[]> map = new HashMap<>();
                    f3406h = map;
                    map.put("", new byte[0]);
                }
                ((d) this).f3401e = kVar2.a((Map) f3406h, 0, false);
                return;
            }
            k kVar3 = new k(gVar.f3424g);
            kVar3.a(this.f3458c);
            if (f3407i == null) {
                f3407i = new HashMap<>();
                HashMap<String, byte[]> map2 = new HashMap<>();
                map2.put("", new byte[0]);
                f3407i.put("", map2);
            }
            this.f3456a = kVar3.a((Map) f3407i, 0, false);
            this.f3457b = new HashMap<>();
        } catch (Exception e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override // com.tencent.bugly.proguard.d
    public final byte[] a() {
        g gVar = this.f3408g;
        if (gVar.f3418a != 2) {
            if (gVar.f3422e == null) {
                gVar.f3422e = "";
            }
            if (gVar.f3423f == null) {
                gVar.f3423f = "";
            }
        } else {
            if (gVar.f3422e.equals("")) {
                throw new IllegalArgumentException("servantName can not is null");
            }
            if (this.f3408g.f3423f.equals("")) {
                throw new IllegalArgumentException("funcName can not is null");
            }
        }
        l lVar = new l(0);
        lVar.a(this.f3458c);
        if (this.f3408g.f3418a == 2) {
            lVar.a((Map) this.f3456a, 0);
        } else {
            lVar.a((Map) ((d) this).f3401e, 0);
        }
        this.f3408g.f3424g = n.a(lVar.f3448a);
        l lVar2 = new l(0);
        lVar2.a(this.f3458c);
        this.f3408g.a(lVar2);
        byte[] bArrA = n.a(lVar2.f3448a);
        int length = bArrA.length + 4;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        byteBufferAllocate.putInt(length).put(bArrA).flip();
        return byteBufferAllocate.array();
    }

    @Override // com.tencent.bugly.proguard.d
    public final void b() {
        super.b();
        this.f3408g.f3418a = (short) 3;
    }

    public final void b(String str) {
        this.f3408g.f3422e = str;
    }

    public final void c() {
        this.f3408g.f3421d = 1;
    }

    public final void c(String str) {
        this.f3408g.f3423f = str;
    }
}
