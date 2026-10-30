path = "carlife/src/main/java/net/easyconn/gwmec/carlife/CarLifeUsbTransport.kt"
with open(path, "r", encoding="utf-8") as f:
    text = f.read()

# 对照 decompiled UsbAccessoryCommunicator.read()
# 原版分两步：
# 1. 读 8 字节 header：bulkTransfer(endpoint, headerBuffer, 0, 8, 0)，循环直到非 0
# 2. 读 body：循环按 Math.min(remaining, maxPacketSize) 读取，timeout 为 1000ms，失败直接重试或断开
# 原版 write()：
# 1. bulkTransfer(endpoint, header, 0, 8, 0)
# 2. bulkTransfer(endpoint, body, 0, size, 0)
# 注意：原版用的是五参数 bulkTransfer(endpoint, buffer, offset, length, timeout)！

print("=== 检查原版与当前读取逻辑差异 ===")
