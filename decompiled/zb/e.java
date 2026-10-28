package zb;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f15816a;

    static {
        e eVar = new e();
        if (!n3.n.J("  ") && !n3.n.J("") && !n3.n.J("")) {
            n3.n.J("");
        }
        f15816a = eVar;
    }

    public final void a(String str, StringBuilder sb2) {
        sb2.append(str);
        sb2.append("bytesPerLine = ");
        sb2.append(Integer.MAX_VALUE);
        sb2.append(",");
        sb2.append('\n');
        sb2.append(str);
        sb2.append("bytesPerGroup = ");
        sb2.append(Integer.MAX_VALUE);
        sb2.append(",");
        sb2.append('\n');
        sb2.append(str);
        sb2.append("groupSeparator = \"");
        sb2.append("  ");
        sb2.append("\",");
        sb2.append('\n');
        sb2.append(str);
        sb2.append("byteSeparator = \"");
        sb2.append("");
        sb2.append("\",");
        sb2.append('\n');
        sb2.append(str);
        sb2.append("bytePrefix = \"");
        sb2.append("");
        sb2.append("\",");
        sb2.append('\n');
        sb2.append(str);
        sb2.append("byteSuffix = \"");
        sb2.append("");
        sb2.append("\"");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("BytesHexFormat(\n");
        a("    ", sb2);
        sb2.append('\n');
        sb2.append(")");
        return sb2.toString();
    }
}
