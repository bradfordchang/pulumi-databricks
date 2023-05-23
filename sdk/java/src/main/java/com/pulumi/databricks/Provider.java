// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.databricks.ProviderArgs;
import com.pulumi.databricks.Utilities;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * The provider type for the databricks package. By default, resources use package-wide configuration
 * settings, however an explicit `Provider` instance may be created and passed during resource
 * construction to achieve fine-grained programmatic control over provider settings. See the
 * [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.
 * 
 */
@ResourceType(type="pulumi:providers:databricks")
public class Provider extends com.pulumi.resources.ProviderResource {
    @Export(name="accountId", type=String.class, parameters={})
    private Output</* @Nullable */ String> accountId;

    public Output<Optional<String>> accountId() {
        return Codegen.optional(this.accountId);
    }
    @Export(name="authType", type=String.class, parameters={})
    private Output</* @Nullable */ String> authType;

    public Output<Optional<String>> authType() {
        return Codegen.optional(this.authType);
    }
    @Export(name="azureClientId", type=String.class, parameters={})
    private Output</* @Nullable */ String> azureClientId;

    public Output<Optional<String>> azureClientId() {
        return Codegen.optional(this.azureClientId);
    }
    @Export(name="azureClientSecret", type=String.class, parameters={})
    private Output</* @Nullable */ String> azureClientSecret;

    public Output<Optional<String>> azureClientSecret() {
        return Codegen.optional(this.azureClientSecret);
    }
    @Export(name="azureEnvironment", type=String.class, parameters={})
    private Output</* @Nullable */ String> azureEnvironment;

    public Output<Optional<String>> azureEnvironment() {
        return Codegen.optional(this.azureEnvironment);
    }
    @Export(name="azureLoginAppId", type=String.class, parameters={})
    private Output</* @Nullable */ String> azureLoginAppId;

    public Output<Optional<String>> azureLoginAppId() {
        return Codegen.optional(this.azureLoginAppId);
    }
    @Export(name="azureTenantId", type=String.class, parameters={})
    private Output</* @Nullable */ String> azureTenantId;

    public Output<Optional<String>> azureTenantId() {
        return Codegen.optional(this.azureTenantId);
    }
    @Export(name="azureWorkspaceResourceId", type=String.class, parameters={})
    private Output</* @Nullable */ String> azureWorkspaceResourceId;

    public Output<Optional<String>> azureWorkspaceResourceId() {
        return Codegen.optional(this.azureWorkspaceResourceId);
    }
    @Export(name="clientId", type=String.class, parameters={})
    private Output</* @Nullable */ String> clientId;

    public Output<Optional<String>> clientId() {
        return Codegen.optional(this.clientId);
    }
    @Export(name="clientSecret", type=String.class, parameters={})
    private Output</* @Nullable */ String> clientSecret;

    public Output<Optional<String>> clientSecret() {
        return Codegen.optional(this.clientSecret);
    }
    @Export(name="configFile", type=String.class, parameters={})
    private Output</* @Nullable */ String> configFile;

    public Output<Optional<String>> configFile() {
        return Codegen.optional(this.configFile);
    }
    @Export(name="databricksCliPath", type=String.class, parameters={})
    private Output</* @Nullable */ String> databricksCliPath;

    public Output<Optional<String>> databricksCliPath() {
        return Codegen.optional(this.databricksCliPath);
    }
    @Export(name="googleCredentials", type=String.class, parameters={})
    private Output</* @Nullable */ String> googleCredentials;

    public Output<Optional<String>> googleCredentials() {
        return Codegen.optional(this.googleCredentials);
    }
    @Export(name="googleServiceAccount", type=String.class, parameters={})
    private Output</* @Nullable */ String> googleServiceAccount;

    public Output<Optional<String>> googleServiceAccount() {
        return Codegen.optional(this.googleServiceAccount);
    }
    @Export(name="host", type=String.class, parameters={})
    private Output</* @Nullable */ String> host;

    public Output<Optional<String>> host() {
        return Codegen.optional(this.host);
    }
    @Export(name="metadataServiceUrl", type=String.class, parameters={})
    private Output</* @Nullable */ String> metadataServiceUrl;

    public Output<Optional<String>> metadataServiceUrl() {
        return Codegen.optional(this.metadataServiceUrl);
    }
    @Export(name="password", type=String.class, parameters={})
    private Output</* @Nullable */ String> password;

    public Output<Optional<String>> password() {
        return Codegen.optional(this.password);
    }
    @Export(name="profile", type=String.class, parameters={})
    private Output</* @Nullable */ String> profile;

    public Output<Optional<String>> profile() {
        return Codegen.optional(this.profile);
    }
    @Export(name="token", type=String.class, parameters={})
    private Output</* @Nullable */ String> token;

    public Output<Optional<String>> token() {
        return Codegen.optional(this.token);
    }
    @Export(name="username", type=String.class, parameters={})
    private Output</* @Nullable */ String> username;

    public Output<Optional<String>> username() {
        return Codegen.optional(this.username);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Provider(String name) {
        this(name, ProviderArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Provider(String name, @Nullable ProviderArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Provider(String name, @Nullable ProviderArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks", name, args == null ? ProviderArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "azureClientSecret",
                "clientSecret",
                "googleCredentials",
                "metadataServiceUrl",
                "password",
                "token"
            ))
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

}
