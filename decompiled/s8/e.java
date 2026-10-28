package s8;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f12607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FileOutputStream f12608b;

    public e(File file) throws IOException {
        File fileCreateTempFile = File.createTempFile("NanoHTTPD-", "", file);
        this.f12607a = fileCreateTempFile;
        this.f12608b = new FileOutputStream(fileCreateTempFile);
    }
}
