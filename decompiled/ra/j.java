package ra;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public enum j implements xa.o {
    CLASS(0),
    INTERFACE(1),
    ENUM_CLASS(2),
    /* JADX INFO: Fake field, exist only in values array */
    ENUM_ENTRY(3),
    ANNOTATION_CLASS(4),
    /* JADX INFO: Fake field, exist only in values array */
    OBJECT(5),
    COMPANION_OBJECT(6);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12032a;

    j(int i7) {
        this.f12032a = i7;
    }

    @Override // xa.o
    public final int getNumber() {
        return this.f12032a;
    }
}
