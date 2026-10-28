package y9;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public enum d {
    /* JADX INFO: Fake field, exist only in values array */
    ALL(0),
    FIELD(1),
    FILE(2),
    PROPERTY(3),
    PROPERTY_GETTER(4),
    PROPERTY_SETTER(5),
    RECEIVER(6),
    CONSTRUCTOR_PARAMETER(7),
    SETTER_PARAMETER(8),
    PROPERTY_DELEGATE_FIELD(9);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15123a;

    d(int i7) {
        this.f15123a = str == null ? n3.l.Z(name()) : str;
    }
}
