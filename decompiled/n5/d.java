package n5;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public enum d {
    /* JADX INFO: Fake field, exist only in values array */
    OTHER(Object.class),
    PURE_BARCODE(Void.class),
    POSSIBLE_FORMATS(List.class),
    TRY_HARDER(Void.class),
    CHARACTER_SET(String.class),
    ALLOWED_LENGTHS(int[].class),
    ASSUME_CODE_39_CHECK_DIGIT(Void.class),
    ASSUME_GS1(Void.class),
    RETURN_CODABAR_START_END(Void.class),
    NEED_RESULT_POINT_CALLBACK(p.class),
    ALLOWED_EAN_EXTENSIONS(int[].class);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f8820a;

    d(Class cls) {
        this.f8820a = cls;
    }
}
