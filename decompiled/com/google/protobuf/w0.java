package com.google.protobuf;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class w0 extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f2872a;

    public static w0 a() {
        return new w0("Protocol message contained an invalid tag (zero).");
    }

    public static w0 b() {
        return new w0("Protocol message had invalid UTF-8.");
    }

    public static v0 c() {
        return new v0("Protocol message tag had invalid wire type.");
    }

    public static w0 d() {
        return new w0("CodedInputStream encountered a malformed varint.");
    }

    public static w0 e() {
        return new w0("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static w0 f() {
        return new w0("Failed to parse the message.");
    }

    public static w0 g() {
        return new w0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
