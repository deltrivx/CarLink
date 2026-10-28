package com.google.protobuf;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class e0 extends b {
    private final j0 defaultInstance;
    protected j0 instance;

    public e0(j0 j0Var) {
        this.defaultInstance = j0Var;
        if (j0Var.isMutable()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.instance = j0Var.newMutableInstance();
    }

    /* JADX INFO: renamed from: build, reason: merged with bridge method [inline-methods] */
    public final j0 m16build() {
        j0 j0VarBuildPartial = buildPartial();
        if (j0VarBuildPartial.isInitialized()) {
            return j0VarBuildPartial;
        }
        throw b.newUninitializedMessageException(j0VarBuildPartial);
    }

    @Override // com.google.protobuf.k1
    public j0 buildPartial() {
        if (!this.instance.isMutable()) {
            return this.instance;
        }
        this.instance.makeImmutable();
        return this.instance;
    }

    /* JADX INFO: renamed from: clear, reason: merged with bridge method [inline-methods] */
    public final e0 m17clear() {
        if (this.defaultInstance.isMutable()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.instance = this.defaultInstance.newMutableInstance();
        return this;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public e0 m20clone() {
        e0 e0VarNewBuilderForType = getDefaultInstanceForType().newBuilderForType();
        e0VarNewBuilderForType.instance = buildPartial();
        return e0VarNewBuilderForType;
    }

    public final void copyOnWrite() {
        if (this.instance.isMutable()) {
            return;
        }
        copyOnWriteInternal();
    }

    public void copyOnWriteInternal() {
        j0 j0VarNewMutableInstance = this.defaultInstance.newMutableInstance();
        j0 j0Var = this.instance;
        u1 u1Var = u1.f2863c;
        u1Var.getClass();
        u1Var.a(j0VarNewMutableInstance.getClass()).b(j0VarNewMutableInstance, j0Var);
        this.instance = j0VarNewMutableInstance;
    }

    @Override // com.google.protobuf.m1
    public j0 getDefaultInstanceForType() {
        return this.defaultInstance;
    }

    @Override // com.google.protobuf.b
    public e0 internalMergeFrom(j0 j0Var) {
        return mergeFrom(j0Var);
    }

    public final boolean isInitialized() {
        return j0.isInitialized(this.instance, false);
    }

    public e0 mergeFrom(j0 j0Var) {
        if (getDefaultInstanceForType().equals(j0Var)) {
            return this;
        }
        copyOnWrite();
        j0 j0Var2 = this.instance;
        u1 u1Var = u1.f2863c;
        u1Var.getClass();
        u1Var.a(j0Var2.getClass()).b(j0Var2, j0Var);
        return this;
    }

    @Override // com.google.protobuf.b
    /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public e0 m21mergeFrom(p pVar, y yVar) throws IOException {
        copyOnWrite();
        try {
            u1 u1Var = u1.f2863c;
            j0 j0Var = this.instance;
            u1Var.getClass();
            x1 x1VarA = u1Var.a(j0Var.getClass());
            j0 j0Var2 = this.instance;
            q qVar = pVar.f2829b;
            if (qVar == null) {
                qVar = new q(pVar);
            }
            x1VarA.c(j0Var2, qVar, yVar);
            return this;
        } catch (RuntimeException e7) {
            if (e7.getCause() instanceof IOException) {
                throw ((IOException) e7.getCause());
            }
            throw e7;
        }
    }

    @Override // com.google.protobuf.b
    /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public e0 m22mergeFrom(byte[] bArr, int i7, int i10) {
        return m23mergeFrom(bArr, i7, i10, y.a());
    }

    @Override // com.google.protobuf.b
    /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public e0 m23mergeFrom(byte[] bArr, int i7, int i10, y yVar) throws w0 {
        copyOnWrite();
        try {
            u1 u1Var = u1.f2863c;
            j0 j0Var = this.instance;
            u1Var.getClass();
            u1Var.a(j0Var.getClass()).f(this.instance, bArr, i7, i7 + i10, new f(yVar));
            return this;
        } catch (w0 e7) {
            throw e7;
        } catch (IOException e10) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e10);
        } catch (IndexOutOfBoundsException unused) {
            throw w0.g();
        }
    }
}
