// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServicePrincipalSecretState extends com.pulumi.resources.ResourceArgs {

    public static final ServicePrincipalSecretState Empty = new ServicePrincipalSecretState();

    @Import(name="secret")
    private @Nullable Output<String> secret;

    public Optional<Output<String>> secret() {
        return Optional.ofNullable(this.secret);
    }

    @Import(name="servicePrincipalId")
    private @Nullable Output<String> servicePrincipalId;

    public Optional<Output<String>> servicePrincipalId() {
        return Optional.ofNullable(this.servicePrincipalId);
    }

    @Import(name="status")
    private @Nullable Output<String> status;

    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    private ServicePrincipalSecretState() {}

    private ServicePrincipalSecretState(ServicePrincipalSecretState $) {
        this.secret = $.secret;
        this.servicePrincipalId = $.servicePrincipalId;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServicePrincipalSecretState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServicePrincipalSecretState $;

        public Builder() {
            $ = new ServicePrincipalSecretState();
        }

        public Builder(ServicePrincipalSecretState defaults) {
            $ = new ServicePrincipalSecretState(Objects.requireNonNull(defaults));
        }

        public Builder secret(@Nullable Output<String> secret) {
            $.secret = secret;
            return this;
        }

        public Builder secret(String secret) {
            return secret(Output.of(secret));
        }

        public Builder servicePrincipalId(@Nullable Output<String> servicePrincipalId) {
            $.servicePrincipalId = servicePrincipalId;
            return this;
        }

        public Builder servicePrincipalId(String servicePrincipalId) {
            return servicePrincipalId(Output.of(servicePrincipalId));
        }

        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        public Builder status(String status) {
            return status(Output.of(status));
        }

        public ServicePrincipalSecretState build() {
            return $;
        }
    }

}
