// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks;

import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;

public final class Config {

    private static final com.pulumi.Config config = com.pulumi.Config.of("databricks");
    public Optional<String> accountId() {
        return Codegen.stringProp("accountId").config(config).get();
    }
    public Optional<String> authType() {
        return Codegen.stringProp("authType").config(config).get();
    }
    public Optional<String> azureClientId() {
        return Codegen.stringProp("azureClientId").config(config).get();
    }
    public Optional<String> azureClientSecret() {
        return Codegen.stringProp("azureClientSecret").config(config).get();
    }
    public Optional<String> azureEnvironment() {
        return Codegen.stringProp("azureEnvironment").config(config).get();
    }
    public Optional<String> azureLoginAppId() {
        return Codegen.stringProp("azureLoginAppId").config(config).get();
    }
    public Optional<String> azureTenantId() {
        return Codegen.stringProp("azureTenantId").config(config).get();
    }
    public Optional<Boolean> azureUseMsi() {
        return Codegen.booleanProp("azureUseMsi").config(config).get();
    }
    public Optional<String> azureWorkspaceResourceId() {
        return Codegen.stringProp("azureWorkspaceResourceId").config(config).get();
    }
    public Optional<String> configFile() {
        return Codegen.stringProp("configFile").config(config).get();
    }
    public Optional<Boolean> debugHeaders() {
        return Codegen.booleanProp("debugHeaders").config(config).get();
    }
    public Optional<Integer> debugTruncateBytes() {
        return Codegen.integerProp("debugTruncateBytes").config(config).get();
    }
    public Optional<String> googleCredentials() {
        return Codegen.stringProp("googleCredentials").config(config).get();
    }
    public Optional<String> googleServiceAccount() {
        return Codegen.stringProp("googleServiceAccount").config(config).get();
    }
    public Optional<String> host() {
        return Codegen.stringProp("host").config(config).get();
    }
    public Optional<Integer> httpTimeoutSeconds() {
        return Codegen.integerProp("httpTimeoutSeconds").config(config).get();
    }
    public Optional<String> password() {
        return Codegen.stringProp("password").config(config).get();
    }
    public Optional<String> profile() {
        return Codegen.stringProp("profile").config(config).get();
    }
    public Optional<Integer> rateLimit() {
        return Codegen.integerProp("rateLimit").config(config).get();
    }
    public Optional<Boolean> skipVerify() {
        return Codegen.booleanProp("skipVerify").config(config).get();
    }
    public Optional<String> token() {
        return Codegen.stringProp("token").config(config).get();
    }
    public Optional<String> username() {
        return Codegen.stringProp("username").config(config).get();
    }
}