package com.google.protobuf;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d0 implements j1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d0 f2730b = new d0(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2731a;

    public /* synthetic */ d0(int i7) {
        this.f2731a = i7;
    }

    @Override // com.google.protobuf.j1
    public final w1 a(Class cls) {
        switch (this.f2731a) {
            case 0:
                if (!j0.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (w1) j0.getDefaultInstance(cls.asSubclass(j0.class)).buildMessageInfo();
                } catch (Exception e7) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e7);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // com.google.protobuf.j1
    public final boolean b(Class cls) {
        switch (this.f2731a) {
            case 0:
                return j0.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
