package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class b implements k1 {
    @Deprecated
    public static <T> void addAll(Iterable<T> iterable, Collection<? super T> collection) {
        addAll((Iterable) iterable, (List) collection);
    }

    public static <T> void addAll(Iterable<T> iterable, List<? super T> list) {
        Charset charset = u0.f2861a;
        iterable.getClass();
        if (iterable instanceof z0) {
            List listA = ((z0) iterable).a();
            z0 z0Var = (z0) list;
            int size = list.size();
            for (Object obj : listA) {
                if (obj == null) {
                    String str = "Element at index " + (z0Var.size() - size) + " is null.";
                    for (int size2 = z0Var.size() - 1; size2 >= size; size2--) {
                        z0Var.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof l) {
                    z0Var.f((l) obj);
                } else {
                    z0Var.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof t1) {
            list.addAll((Collection) iterable);
            return;
        }
        if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) list).ensureCapacity(((Collection) iterable).size() + list.size());
        }
        int size3 = list.size();
        for (T t2 : iterable) {
            if (t2 == null) {
                String str2 = "Element at index " + (list.size() - size3) + " is null.";
                for (int size4 = list.size() - 1; size4 >= size3; size4--) {
                    list.remove(size4);
                }
                throw new NullPointerException(str2);
            }
            list.add(t2);
        }
    }

    public static z1 newUninitializedMessageException(l1 l1Var) {
        return new z1();
    }

    public final String a() {
        return "Reading " + getClass().getName() + " from a ByteString threw an IOException (should never happen).";
    }

    public abstract b internalMergeFrom(c cVar);

    public boolean mergeDelimitedFrom(InputStream inputStream) {
        return mergeDelimitedFrom(inputStream, y.a());
    }

    public boolean mergeDelimitedFrom(InputStream inputStream, y yVar) throws IOException {
        int i7 = inputStream.read();
        if (i7 == -1) {
            return false;
        }
        m13mergeFrom((InputStream) new a(inputStream, p.s(i7, inputStream), 0), yVar);
        return true;
    }

    /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public b m8mergeFrom(l1 l1Var) {
        if (getDefaultInstanceForType().getClass().isInstance(l1Var)) {
            return internalMergeFrom((c) l1Var);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public b m9mergeFrom(l lVar) throws w0 {
        try {
            p pVarQ = lVar.q();
            m11mergeFrom(pVarQ);
            pVarQ.a(0);
            return this;
        } catch (w0 e7) {
            throw e7;
        } catch (IOException e10) {
            throw new RuntimeException(a(), e10);
        }
    }

    /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public b m10mergeFrom(l lVar, y yVar) throws w0 {
        try {
            p pVarQ = lVar.q();
            m21mergeFrom(pVarQ, yVar);
            pVarQ.a(0);
            return this;
        } catch (w0 e7) {
            throw e7;
        } catch (IOException e10) {
            throw new RuntimeException(a(), e10);
        }
    }

    /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public b m11mergeFrom(p pVar) {
        return m21mergeFrom(pVar, y.a());
    }

    /* JADX INFO: renamed from: mergeFrom */
    public abstract b m21mergeFrom(p pVar, y yVar);

    /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public b m12mergeFrom(InputStream inputStream) {
        p pVarG = p.g(inputStream);
        m11mergeFrom(pVarG);
        pVarG.a(0);
        return this;
    }

    /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public b m13mergeFrom(InputStream inputStream, y yVar) {
        p pVarG = p.g(inputStream);
        m21mergeFrom(pVarG, yVar);
        pVarG.a(0);
        return this;
    }

    /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public b m14mergeFrom(byte[] bArr) {
        return m22mergeFrom(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: mergeFrom */
    public abstract b m22mergeFrom(byte[] bArr, int i7, int i10);

    /* JADX INFO: renamed from: mergeFrom */
    public abstract b m23mergeFrom(byte[] bArr, int i7, int i10, y yVar);

    /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public b m15mergeFrom(byte[] bArr, y yVar) {
        return m23mergeFrom(bArr, 0, bArr.length, yVar);
    }
}
