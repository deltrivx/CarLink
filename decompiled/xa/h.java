package xa;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h f14788c = new h(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f14789a = new z(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f14790b;

    public h() {
    }

    public h(int i7) {
        f();
    }

    public static int c(m0 m0Var, Object obj) {
        switch (m0Var.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                return 8;
            case 1:
                ((Float) obj).getClass();
                return 4;
            case 2:
                return d3.e.i(((Long) obj).longValue());
            case 3:
                return d3.e.i(((Long) obj).longValue());
            case 4:
                return d3.e.e(((Integer) obj).intValue());
            case 5:
                ((Long) obj).getClass();
                return 8;
            case 6:
                ((Integer) obj).getClass();
                return 4;
            case 7:
                ((Boolean) obj).getClass();
                return 1;
            case 8:
                try {
                    byte[] bytes = ((String) obj).getBytes("UTF-8");
                    return d3.e.h(bytes.length) + bytes.length;
                } catch (UnsupportedEncodingException e7) {
                    throw new RuntimeException("UTF-8 not supported.", e7);
                }
            case 9:
                return ((a) obj).a();
            case 10:
                return d3.e.g((a) obj);
            case 11:
                if (obj instanceof d) {
                    d dVar = (d) obj;
                    return dVar.size() + d3.e.h(dVar.size());
                }
                byte[] bArr = (byte[]) obj;
                return d3.e.h(bArr.length) + bArr.length;
            case 12:
                return d3.e.h(((Integer) obj).intValue());
            case 13:
                return obj instanceof o ? d3.e.e(((o) obj).getNumber()) : d3.e.e(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).getClass();
                return 4;
            case 15:
                ((Long) obj).getClass();
                return 8;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                return d3.e.h((iIntValue >> 31) ^ (iIntValue << 1));
            case 17:
                long jLongValue = ((Long) obj).longValue();
                return d3.e.i((jLongValue >> 63) ^ (jLongValue << 1));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int d(l lVar, Object obj) {
        m0 m0Var = lVar.f14797b;
        int i7 = lVar.f14796a;
        if (!lVar.f14798c) {
            int iJ = d3.e.j(i7);
            if (m0Var == m0.f14806e) {
                iJ *= 2;
            }
            return c(m0Var, obj) + iJ;
        }
        int iC = 0;
        for (Object obj2 : (List) obj) {
            int iJ2 = d3.e.j(i7);
            if (m0Var == m0.f14806e) {
                iJ2 *= 2;
            }
            iC += c(m0Var, obj2) + iJ2;
        }
        return iC;
    }

    public static boolean e(Map.Entry entry) {
        l lVar = (l) entry.getKey();
        if (lVar.f14797b.f14810a != n0.MESSAGE) {
            return true;
        }
        if (!lVar.f14798c) {
            Object value = entry.getValue();
            if (value instanceof a) {
                return ((a) value).isInitialized();
            }
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        Iterator it = ((List) entry.getValue()).iterator();
        while (it.hasNext()) {
            if (!((a) it.next()).isInitialized()) {
                return false;
            }
        }
        return true;
    }

    public static Object h(e eVar, m0 m0Var) {
        switch (m0Var.ordinal()) {
            case 0:
                return Double.valueOf(Double.longBitsToDouble(eVar.j()));
            case 1:
                return Float.valueOf(Float.intBitsToFloat(eVar.i()));
            case 2:
                return Long.valueOf(eVar.l());
            case 3:
                return Long.valueOf(eVar.l());
            case 4:
                return Integer.valueOf(eVar.k());
            case 5:
                return Long.valueOf(eVar.j());
            case 6:
                return Integer.valueOf(eVar.i());
            case 7:
                return Boolean.valueOf(eVar.l() != 0);
            case 8:
                int iK = eVar.k();
                int i7 = eVar.f14770b;
                int i10 = eVar.f14772d;
                if (iK > i7 - i10 || iK <= 0) {
                    return iK == 0 ? "" : new String(eVar.h(iK), "UTF-8");
                }
                String str = new String(eVar.f14769a, i10, iK, "UTF-8");
                eVar.f14772d += iK;
                return str;
            case 9:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case 10:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 11:
                return eVar.e();
            case 12:
                return Integer.valueOf(eVar.k());
            case 13:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            case 14:
                return Integer.valueOf(eVar.i());
            case 15:
                return Long.valueOf(eVar.j());
            case 16:
                int iK2 = eVar.k();
                return Integer.valueOf((-(iK2 & 1)) ^ (iK2 >>> 1));
            case 17:
                long jL = eVar.l();
                return Long.valueOf((-(jL & 1)) ^ (jL >>> 1));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001b  */
    public static void j(m0 m0Var, Object obj) {
        obj.getClass();
        boolean z10 = true;
        boolean z11 = false;
        switch (m0Var.f14810a) {
            case INT:
                z11 = obj instanceof Integer;
                break;
            case LONG:
                z11 = obj instanceof Long;
                break;
            case FLOAT:
                z11 = obj instanceof Float;
                break;
            case DOUBLE:
                z11 = obj instanceof Double;
                break;
            case BOOLEAN:
                z11 = obj instanceof Boolean;
                break;
            case STRING:
                z11 = obj instanceof String;
                break;
            case BYTE_STRING:
                if (!(obj instanceof d) && !(obj instanceof byte[])) {
                    z10 = false;
                }
                z11 = z10;
                break;
            case ENUM:
                if (!(obj instanceof Integer) && !(obj instanceof o)) {
                    z10 = false;
                }
                z11 = z10;
                break;
            case MESSAGE:
                z11 = obj instanceof a;
                break;
        }
        if (!z11) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
    }

    public static void k(d3.e eVar, m0 m0Var, Object obj) {
        switch (m0Var.ordinal()) {
            case 0:
                double dDoubleValue = ((Double) obj).doubleValue();
                eVar.getClass();
                eVar.I(Double.doubleToRawLongBits(dDoubleValue));
                break;
            case 1:
                float fFloatValue = ((Float) obj).floatValue();
                eVar.getClass();
                eVar.H(Float.floatToRawIntBits(fFloatValue));
                break;
            case 2:
                eVar.K(((Long) obj).longValue());
                break;
            case 3:
                eVar.K(((Long) obj).longValue());
                break;
            case 4:
                eVar.B(((Integer) obj).intValue());
                break;
            case 5:
                eVar.I(((Long) obj).longValue());
                break;
            case 6:
                eVar.H(((Integer) obj).intValue());
                break;
            case 7:
                eVar.E(((Boolean) obj).booleanValue() ? 1 : 0);
                break;
            case 8:
                eVar.getClass();
                byte[] bytes = ((String) obj).getBytes("UTF-8");
                eVar.J(bytes.length);
                eVar.G(bytes);
                break;
            case 9:
                eVar.getClass();
                ((a) obj).d(eVar);
                break;
            case 10:
                eVar.D((a) obj);
                break;
            case 11:
                if (!(obj instanceof d)) {
                    byte[] bArr = (byte[]) obj;
                    eVar.getClass();
                    eVar.J(bArr.length);
                    eVar.G(bArr);
                } else {
                    d dVar = (d) obj;
                    eVar.getClass();
                    eVar.J(dVar.size());
                    eVar.F(dVar);
                }
                break;
            case 12:
                eVar.J(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof o)) {
                    eVar.B(((Integer) obj).intValue());
                } else {
                    eVar.B(((o) obj).getNumber());
                }
                break;
            case 14:
                eVar.H(((Integer) obj).intValue());
                break;
            case 15:
                eVar.I(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                eVar.J((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                eVar.K((jLongValue >> 63) ^ (jLongValue << 1));
                break;
        }
    }

    public final void a(l lVar, Object obj) {
        List arrayList;
        if (!lVar.f14798c) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        j(lVar.f14797b, obj);
        z zVar = this.f14789a;
        Object obj2 = zVar.get(lVar);
        if (obj2 == null) {
            arrayList = new ArrayList();
            zVar.put(lVar, arrayList);
        } else {
            arrayList = (List) obj2;
        }
        arrayList.add(obj);
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final h clone() {
        z zVar;
        h hVar = new h();
        int i7 = 0;
        while (true) {
            zVar = this.f14789a;
            if (i7 >= zVar.f14842b.size()) {
                break;
            }
            Map.Entry entry = (Map.Entry) zVar.f14842b.get(i7);
            hVar.i((l) entry.getKey(), entry.getValue());
            i7++;
        }
        for (Map.Entry entry2 : zVar.c()) {
            hVar.i((l) entry2.getKey(), entry2.getValue());
        }
        return hVar;
    }

    public final void f() {
        if (this.f14790b) {
            return;
        }
        z zVar = this.f14789a;
        if (!zVar.f14844d) {
            for (int i7 = 0; i7 < zVar.f14842b.size(); i7++) {
                Map.Entry entry = (Map.Entry) zVar.f14842b.get(i7);
                if (((l) entry.getKey()).f14798c) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
            for (Map.Entry entry2 : zVar.c()) {
                if (((l) entry2.getKey()).f14798c) {
                    entry2.setValue(Collections.unmodifiableList((List) entry2.getValue()));
                }
            }
        }
        if (!zVar.f14844d) {
            zVar.f14843c = zVar.f14843c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(zVar.f14843c);
            zVar.f14844d = true;
        }
        this.f14790b = true;
    }

    public final void g(Map.Entry entry) {
        l lVar = (l) entry.getKey();
        Object value = entry.getValue();
        boolean z10 = lVar.f14798c;
        z zVar = this.f14789a;
        if (z10) {
            Object arrayList = zVar.get(lVar);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            for (Object obj : (List) value) {
                List list = (List) arrayList;
                if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    byte[] bArr2 = new byte[bArr.length];
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    obj = bArr2;
                }
                list.add(obj);
            }
            zVar.put(lVar, arrayList);
            return;
        }
        if (lVar.f14797b.f14810a != n0.MESSAGE) {
            if (value instanceof byte[]) {
                byte[] bArr3 = (byte[]) value;
                byte[] bArr4 = new byte[bArr3.length];
                System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                value = bArr4;
            }
            zVar.put(lVar, value);
            return;
        }
        Object obj2 = zVar.get(lVar);
        if (obj2 != null) {
            zVar.put(lVar, ((a) obj2).c().c((n) ((a) value)).a());
            return;
        }
        if (value instanceof byte[]) {
            byte[] bArr5 = (byte[]) value;
            byte[] bArr6 = new byte[bArr5.length];
            System.arraycopy(bArr5, 0, bArr6, 0, bArr5.length);
            value = bArr6;
        }
        zVar.put(lVar, value);
    }

    public final void i(l lVar, Object obj) {
        boolean z10 = lVar.f14798c;
        m0 m0Var = lVar.f14797b;
        if (!z10) {
            j(m0Var, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                j(m0Var, it.next());
            }
            obj = arrayList;
        }
        this.f14789a.put(lVar, obj);
    }
}
