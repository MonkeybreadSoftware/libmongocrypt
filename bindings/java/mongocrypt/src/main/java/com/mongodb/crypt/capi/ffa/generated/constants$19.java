// Generated by jextract

package com.mongodb.crypt.capi.ffa.generated;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$19 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$19() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "mongocrypt_setopt_aes_256_ctr",
        constants$18.const$0
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "mongocrypt_setopt_aes_256_ecb",
        constants$8.const$3
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "mongocrypt_setopt_crypto_hook_sign_rsaes_pkcs1_v1_5",
        constants$8.const$3
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "mongocrypt_setopt_bypass_query_analysis",
        constants$0.const$3
    );
    static final FunctionDescriptor const$4 = FunctionDescriptor.of(JAVA_BOOLEAN,
        RuntimeHelper.POINTER,
        JAVA_LONG
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "mongocrypt_ctx_setopt_contention_factor",
        constants$19.const$4
    );
}


