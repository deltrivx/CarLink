package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class j0 extends c {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, j0> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected a2 unknownFields;

    public j0() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = a2.f2712f;
    }

    public static h0 access$000(w wVar) {
        wVar.getClass();
        return (h0) wVar;
    }

    public static void b(j0 j0Var) throws w0 {
        if (j0Var == null || j0Var.isInitialized()) {
            return;
        }
        z1 z1VarNewUninitializedMessageException = j0Var.newUninitializedMessageException();
        z1VarNewUninitializedMessageException.getClass();
        throw new w0(z1VarNewUninitializedMessageException.getMessage());
    }

    public static j0 c(j0 j0Var, InputStream inputStream, y yVar) throws w0 {
        try {
            int i7 = inputStream.read();
            if (i7 == -1) {
                return null;
            }
            p pVarG = p.g(new a(inputStream, p.s(i7, inputStream), 0));
            j0 partialFrom = parsePartialFrom(j0Var, pVarG, yVar);
            pVarG.a(0);
            return partialFrom;
        } catch (w0 e7) {
            if (e7.f2872a) {
                throw new w0(e7.getMessage(), e7);
            }
            throw e7;
        } catch (IOException e10) {
            throw new w0(e10.getMessage(), e10);
        }
    }

    public static j0 d(j0 j0Var, byte[] bArr, int i7, int i10, y yVar) throws w0 {
        j0 j0VarNewMutableInstance = j0Var.newMutableInstance();
        try {
            u1 u1Var = u1.f2863c;
            u1Var.getClass();
            x1 x1VarA = u1Var.a(j0VarNewMutableInstance.getClass());
            x1VarA.f(j0VarNewMutableInstance, bArr, i7, i7 + i10, new f(yVar));
            x1VarA.d(j0VarNewMutableInstance);
            return j0VarNewMutableInstance;
        } catch (w0 e7) {
            if (e7.f2872a) {
                throw new w0(e7.getMessage(), e7);
            }
            throw e7;
        } catch (z1 e10) {
            throw new w0(e10.getMessage());
        } catch (IOException e11) {
            if (e11.getCause() instanceof w0) {
                throw ((w0) e11.getCause());
            }
            throw new w0(e11.getMessage(), e11);
        } catch (IndexOutOfBoundsException unused) {
            throw w0.g();
        }
    }

    public static l0 emptyBooleanList() {
        return g.f2745d;
    }

    public static m0 emptyDoubleList() {
        return v.f2866d;
    }

    public static q0 emptyFloatList() {
        return c0.f2723d;
    }

    public static r0 emptyIntList() {
        return k0.f2781d;
    }

    public static s0 emptyLongList() {
        return d1.f2732d;
    }

    public static <E> t0 emptyProtobufList() {
        return v1.f2869d;
    }

    public static <T extends j0> T getDefaultInstance(Class<T> cls) {
        T t2 = (T) defaultInstanceMap.get(cls);
        if (t2 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t2 = (T) defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e7) {
                throw new IllegalStateException("Class initialization cannot fail.", e7);
            }
        }
        if (t2 != null) {
            return t2;
        }
        T t4 = (T) ((j0) j2.b(cls)).getDefaultInstanceForType();
        if (t4 == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, t4);
        return t4;
    }

    public static Method getMethodOrDie(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e7) {
            throw new RuntimeException("Generated message class \"" + cls.getName() + "\" missing method \"" + str + "\".", e7);
        }
    }

    public static Object invokeOrDie(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e7) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e7);
        } catch (InvocationTargetException e10) {
            Throwable cause = e10.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static final <T extends j0> boolean isInitialized(T t2, boolean z10) {
        byte bByteValue = ((Byte) t2.dynamicMethod(i0.f2759a)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        u1 u1Var = u1.f2863c;
        u1Var.getClass();
        boolean zE = u1Var.a(t2.getClass()).e(t2);
        if (z10) {
            t2.dynamicMethod(i0.f2760b, zE ? t2 : null);
        }
        return zE;
    }

    public static l0 mutableCopy(l0 l0Var) {
        g gVar = (g) l0Var;
        int i7 = gVar.f2747c;
        int i10 = i7 == 0 ? 10 : i7 * 2;
        if (i10 >= i7) {
            return new g(Arrays.copyOf(gVar.f2746b, i10), gVar.f2747c);
        }
        throw new IllegalArgumentException();
    }

    public static m0 mutableCopy(m0 m0Var) {
        v vVar = (v) m0Var;
        int i7 = vVar.f2868c;
        int i10 = i7 == 0 ? 10 : i7 * 2;
        if (i10 >= i7) {
            return new v(Arrays.copyOf(vVar.f2867b, i10), vVar.f2868c);
        }
        throw new IllegalArgumentException();
    }

    public static q0 mutableCopy(q0 q0Var) {
        c0 c0Var = (c0) q0Var;
        int i7 = c0Var.f2725c;
        int i10 = i7 == 0 ? 10 : i7 * 2;
        if (i10 >= i7) {
            return new c0(Arrays.copyOf(c0Var.f2724b, i10), c0Var.f2725c);
        }
        throw new IllegalArgumentException();
    }

    public static r0 mutableCopy(r0 r0Var) {
        k0 k0Var = (k0) r0Var;
        int i7 = k0Var.f2783c;
        int i10 = i7 == 0 ? 10 : i7 * 2;
        if (i10 >= i7) {
            return new k0(Arrays.copyOf(k0Var.f2782b, i10), k0Var.f2783c);
        }
        throw new IllegalArgumentException();
    }

    public static s0 mutableCopy(s0 s0Var) {
        d1 d1Var = (d1) s0Var;
        int i7 = d1Var.f2734c;
        int i10 = i7 == 0 ? 10 : i7 * 2;
        if (i10 >= i7) {
            return new d1(Arrays.copyOf(d1Var.f2733b, i10), d1Var.f2734c);
        }
        throw new IllegalArgumentException();
    }

    public static <E> t0 mutableCopy(t0 t0Var) {
        int size = t0Var.size();
        return t0Var.e(size == 0 ? 10 : size * 2);
    }

    public static Object newMessageInfo(l1 l1Var, String str, Object[] objArr) {
        return new w1(l1Var, str, objArr);
    }

    public static <ContainingType extends l1, Type> h0 newRepeatedGeneratedExtension(ContainingType containingtype, l1 l1Var, o0 o0Var, int i7, r2 r2Var, boolean z10, Class cls) {
        return new h0(containingtype, Collections.EMPTY_LIST, l1Var, new g0(o0Var, i7, r2Var, true, z10));
    }

    public static <ContainingType extends l1, Type> h0 newSingularGeneratedExtension(ContainingType containingtype, Type type, l1 l1Var, o0 o0Var, int i7, r2 r2Var, Class cls) {
        return new h0(containingtype, type, l1Var, new g0(o0Var, i7, r2Var, false, false));
    }

    public static <T extends j0> T parseDelimitedFrom(T t2, InputStream inputStream) throws w0 {
        T t4 = (T) c(t2, inputStream, y.a());
        b(t4);
        return t4;
    }

    public static <T extends j0> T parseDelimitedFrom(T t2, InputStream inputStream, y yVar) throws w0 {
        T t4 = (T) c(t2, inputStream, yVar);
        b(t4);
        return t4;
    }

    public static <T extends j0> T parseFrom(T t2, l lVar) throws w0 {
        T t4 = (T) parseFrom(t2, lVar, y.a());
        b(t4);
        return t4;
    }

    public static <T extends j0> T parseFrom(T t2, l lVar, y yVar) throws w0 {
        p pVarQ = lVar.q();
        T t4 = (T) parsePartialFrom(t2, pVarQ, yVar);
        pVarQ.a(0);
        b(t4);
        return t4;
    }

    public static <T extends j0> T parseFrom(T t2, p pVar) {
        return (T) parseFrom(t2, pVar, y.a());
    }

    public static <T extends j0> T parseFrom(T t2, p pVar, y yVar) throws w0 {
        T t4 = (T) parsePartialFrom(t2, pVar, yVar);
        b(t4);
        return t4;
    }

    public static <T extends j0> T parseFrom(T t2, InputStream inputStream) throws w0 {
        T t4 = (T) parsePartialFrom(t2, p.g(inputStream), y.a());
        b(t4);
        return t4;
    }

    public static <T extends j0> T parseFrom(T t2, InputStream inputStream, y yVar) throws w0 {
        T t4 = (T) parsePartialFrom(t2, p.g(inputStream), yVar);
        b(t4);
        return t4;
    }

    public static <T extends j0> T parseFrom(T t2, ByteBuffer byteBuffer) {
        return (T) parseFrom(t2, byteBuffer, y.a());
    }

    public static <T extends j0> T parseFrom(T t2, ByteBuffer byteBuffer, y yVar) throws w0 {
        p pVarF;
        if (byteBuffer.hasArray()) {
            pVarF = p.f(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining(), false);
        } else if (byteBuffer.isDirect() && j2.f2775d) {
            pVarF = new o(byteBuffer, false);
        } else {
            int iRemaining = byteBuffer.remaining();
            byte[] bArr = new byte[iRemaining];
            byteBuffer.duplicate().get(bArr);
            pVarF = p.f(bArr, 0, iRemaining, true);
        }
        T t4 = (T) parseFrom(t2, pVarF, yVar);
        b(t4);
        return t4;
    }

    public static <T extends j0> T parseFrom(T t2, byte[] bArr) throws w0 {
        T t4 = (T) d(t2, bArr, 0, bArr.length, y.a());
        b(t4);
        return t4;
    }

    public static <T extends j0> T parseFrom(T t2, byte[] bArr, y yVar) throws w0 {
        T t4 = (T) d(t2, bArr, 0, bArr.length, yVar);
        b(t4);
        return t4;
    }

    public static <T extends j0> T parsePartialFrom(T t2, p pVar) {
        return (T) parsePartialFrom(t2, pVar, y.a());
    }

    public static <T extends j0> T parsePartialFrom(T t2, p pVar, y yVar) throws w0 {
        T t4 = (T) t2.newMutableInstance();
        try {
            u1 u1Var = u1.f2863c;
            u1Var.getClass();
            x1 x1VarA = u1Var.a(t4.getClass());
            q qVar = pVar.f2829b;
            if (qVar == null) {
                qVar = new q(pVar);
            }
            x1VarA.c(t4, qVar, yVar);
            x1VarA.d(t4);
            return t4;
        } catch (w0 e7) {
            if (e7.f2872a) {
                throw new w0(e7.getMessage(), e7);
            }
            throw e7;
        } catch (z1 e10) {
            throw new w0(e10.getMessage());
        } catch (IOException e11) {
            if (e11.getCause() instanceof w0) {
                throw ((w0) e11.getCause());
            }
            throw new w0(e11.getMessage(), e11);
        } catch (RuntimeException e12) {
            if (e12.getCause() instanceof w0) {
                throw ((w0) e12.getCause());
            }
            throw e12;
        }
    }

    public static <T extends j0> void registerDefaultInstance(Class<T> cls, T t2) {
        t2.markImmutable();
        defaultInstanceMap.put(cls, t2);
    }

    public Object buildMessageInfo() {
        return dynamicMethod(i0.f2761c);
    }

    public void clearMemoizedHashCode() {
        this.memoizedHashCode = 0;
    }

    public void clearMemoizedSerializedSize() {
        setMemoizedSerializedSize(Integer.MAX_VALUE);
    }

    public int computeHashCode() {
        u1 u1Var = u1.f2863c;
        u1Var.getClass();
        return u1Var.a(getClass()).g(this);
    }

    public final <MessageType extends j0, BuilderType extends e0> BuilderType createBuilder() {
        return (BuilderType) dynamicMethod(i0.f2763e);
    }

    public final <MessageType extends j0, BuilderType extends e0> BuilderType createBuilder(MessageType messagetype) {
        return (BuilderType) createBuilder().mergeFrom((j0) messagetype);
    }

    public Object dynamicMethod(i0 i0Var) {
        return dynamicMethod(i0Var, null, null);
    }

    public Object dynamicMethod(i0 i0Var, Object obj) {
        return dynamicMethod(i0Var, obj, null);
    }

    public abstract Object dynamicMethod(i0 i0Var, Object obj, Object obj2);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        u1 u1Var = u1.f2863c;
        u1Var.getClass();
        return u1Var.a(getClass()).i(this, (j0) obj);
    }

    @Override // com.google.protobuf.m1
    public final j0 getDefaultInstanceForType() {
        return (j0) dynamicMethod(i0.f2764f);
    }

    public int getMemoizedHashCode() {
        return this.memoizedHashCode;
    }

    public int getMemoizedSerializedSize() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }

    public final s1 getParserForType() {
        return (s1) dynamicMethod(i0.f2765g);
    }

    @Override // com.google.protobuf.l1
    public int getSerializedSize() {
        return getSerializedSize(null);
    }

    @Override // com.google.protobuf.c
    public int getSerializedSize(x1 x1Var) {
        int iH;
        int iH2;
        if (isMutable()) {
            if (x1Var == null) {
                u1 u1Var = u1.f2863c;
                u1Var.getClass();
                iH2 = u1Var.a(getClass()).h(this);
            } else {
                iH2 = x1Var.h(this);
            }
            if (iH2 >= 0) {
                return iH2;
            }
            throw new IllegalStateException(a2.f.E(iH2, "serialized size must be non-negative, was "));
        }
        if (getMemoizedSerializedSize() != Integer.MAX_VALUE) {
            return getMemoizedSerializedSize();
        }
        if (x1Var == null) {
            u1 u1Var2 = u1.f2863c;
            u1Var2.getClass();
            iH = u1Var2.a(getClass()).h(this);
        } else {
            iH = x1Var.h(this);
        }
        setMemoizedSerializedSize(iH);
        return iH;
    }

    public int hashCode() {
        if (isMutable()) {
            return computeHashCode();
        }
        if (hashCodeIsNotMemoized()) {
            setMemoizedHashCode(computeHashCode());
        }
        return getMemoizedHashCode();
    }

    public boolean hashCodeIsNotMemoized() {
        return getMemoizedHashCode() == 0;
    }

    public final boolean isInitialized() {
        return isInitialized(this, true);
    }

    public boolean isMutable() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    public void makeImmutable() {
        u1 u1Var = u1.f2863c;
        u1Var.getClass();
        u1Var.a(getClass()).d(this);
        markImmutable();
    }

    public void markImmutable() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public void mergeLengthDelimitedField(int i7, l lVar) {
        if (this.unknownFields == a2.f2712f) {
            this.unknownFields = new a2();
        }
        a2 a2Var = this.unknownFields;
        a2Var.a();
        if (i7 == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        a2Var.f((i7 << 3) | 2, lVar);
    }

    public final void mergeUnknownFields(a2 a2Var) {
        this.unknownFields = a2.e(this.unknownFields, a2Var);
    }

    public void mergeVarintField(int i7, int i10) {
        if (this.unknownFields == a2.f2712f) {
            this.unknownFields = new a2();
        }
        a2 a2Var = this.unknownFields;
        a2Var.a();
        if (i7 == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        a2Var.f(i7 << 3, Long.valueOf(i10));
    }

    @Override // com.google.protobuf.l1
    public final e0 newBuilderForType() {
        return (e0) dynamicMethod(i0.f2763e);
    }

    public j0 newMutableInstance() {
        return (j0) dynamicMethod(i0.f2762d);
    }

    public boolean parseUnknownField(int i7, p pVar) {
        if ((i7 & 7) == 4) {
            return false;
        }
        if (this.unknownFields == a2.f2712f) {
            this.unknownFields = new a2();
        }
        return this.unknownFields.d(i7, pVar);
    }

    public void setMemoizedHashCode(int i7) {
        this.memoizedHashCode = i7;
    }

    public void setMemoizedSerializedSize(int i7) {
        if (i7 < 0) {
            throw new IllegalStateException(a2.f.E(i7, "serialized size must be non-negative, was "));
        }
        this.memoizedSerializedSize = (i7 & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
    }

    /* JADX INFO: renamed from: toBuilder, reason: merged with bridge method [inline-methods] */
    public final e0 m24toBuilder() {
        return ((e0) dynamicMethod(i0.f2763e)).mergeFrom(this);
    }

    public String toString() {
        String string = super.toString();
        char[] cArr = n1.f2804a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(string);
        n1.c(this, sb2, 0);
        return sb2.toString();
    }

    @Override // com.google.protobuf.l1
    public void writeTo(u uVar) {
        u1 u1Var = u1.f2863c;
        u1Var.getClass();
        x1 x1VarA = u1Var.a(getClass());
        f1 f1Var = uVar.f2860j;
        if (f1Var == null) {
            f1Var = new f1(uVar);
        }
        x1VarA.a(this, f1Var);
    }
}
