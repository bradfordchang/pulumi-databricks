// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SecretState extends com.pulumi.resources.ResourceArgs {

    public static final SecretState Empty = new SecretState();

    /**
     * (String) value to use as a secret reference in [Spark configuration and environment variables](https://docs.databricks.com/security/secrets/secrets.html#use-a-secret-in-a-spark-configuration-property-or-environment-variable): `{{secrets/scope/key}}`.
     * 
     */
    @Import(name="configReference")
    private @Nullable Output<String> configReference;

    /**
     * @return (String) value to use as a secret reference in [Spark configuration and environment variables](https://docs.databricks.com/security/secrets/secrets.html#use-a-secret-in-a-spark-configuration-property-or-environment-variable): `{{secrets/scope/key}}`.
     * 
     */
    public Optional<Output<String>> configReference() {
        return Optional.ofNullable(this.configReference);
    }

    /**
     * (String) key within secret scope. Must consist of alphanumeric characters, dashes, underscores, and periods, and may not exceed 128 characters.
     * 
     */
    @Import(name="key")
    private @Nullable Output<String> key;

    /**
     * @return (String) key within secret scope. Must consist of alphanumeric characters, dashes, underscores, and periods, and may not exceed 128 characters.
     * 
     */
    public Optional<Output<String>> key() {
        return Optional.ofNullable(this.key);
    }

    /**
     * (Integer) time secret was updated
     * 
     */
    @Import(name="lastUpdatedTimestamp")
    private @Nullable Output<Integer> lastUpdatedTimestamp;

    /**
     * @return (Integer) time secret was updated
     * 
     */
    public Optional<Output<Integer>> lastUpdatedTimestamp() {
        return Optional.ofNullable(this.lastUpdatedTimestamp);
    }

    /**
     * (String) name of databricks secret scope. Must consist of alphanumeric characters, dashes, underscores, and periods, and may not exceed 128 characters.
     * 
     */
    @Import(name="scope")
    private @Nullable Output<String> scope;

    /**
     * @return (String) name of databricks secret scope. Must consist of alphanumeric characters, dashes, underscores, and periods, and may not exceed 128 characters.
     * 
     */
    public Optional<Output<String>> scope() {
        return Optional.ofNullable(this.scope);
    }

    /**
     * (String) super secret sensitive value.
     * 
     */
    @Import(name="stringValue")
    private @Nullable Output<String> stringValue;

    /**
     * @return (String) super secret sensitive value.
     * 
     */
    public Optional<Output<String>> stringValue() {
        return Optional.ofNullable(this.stringValue);
    }

    private SecretState() {}

    private SecretState(SecretState $) {
        this.configReference = $.configReference;
        this.key = $.key;
        this.lastUpdatedTimestamp = $.lastUpdatedTimestamp;
        this.scope = $.scope;
        this.stringValue = $.stringValue;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SecretState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecretState $;

        public Builder() {
            $ = new SecretState();
        }

        public Builder(SecretState defaults) {
            $ = new SecretState(Objects.requireNonNull(defaults));
        }

        /**
         * @param configReference (String) value to use as a secret reference in [Spark configuration and environment variables](https://docs.databricks.com/security/secrets/secrets.html#use-a-secret-in-a-spark-configuration-property-or-environment-variable): `{{secrets/scope/key}}`.
         * 
         * @return builder
         * 
         */
        public Builder configReference(@Nullable Output<String> configReference) {
            $.configReference = configReference;
            return this;
        }

        /**
         * @param configReference (String) value to use as a secret reference in [Spark configuration and environment variables](https://docs.databricks.com/security/secrets/secrets.html#use-a-secret-in-a-spark-configuration-property-or-environment-variable): `{{secrets/scope/key}}`.
         * 
         * @return builder
         * 
         */
        public Builder configReference(String configReference) {
            return configReference(Output.of(configReference));
        }

        /**
         * @param key (String) key within secret scope. Must consist of alphanumeric characters, dashes, underscores, and periods, and may not exceed 128 characters.
         * 
         * @return builder
         * 
         */
        public Builder key(@Nullable Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key (String) key within secret scope. Must consist of alphanumeric characters, dashes, underscores, and periods, and may not exceed 128 characters.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param lastUpdatedTimestamp (Integer) time secret was updated
         * 
         * @return builder
         * 
         */
        public Builder lastUpdatedTimestamp(@Nullable Output<Integer> lastUpdatedTimestamp) {
            $.lastUpdatedTimestamp = lastUpdatedTimestamp;
            return this;
        }

        /**
         * @param lastUpdatedTimestamp (Integer) time secret was updated
         * 
         * @return builder
         * 
         */
        public Builder lastUpdatedTimestamp(Integer lastUpdatedTimestamp) {
            return lastUpdatedTimestamp(Output.of(lastUpdatedTimestamp));
        }

        /**
         * @param scope (String) name of databricks secret scope. Must consist of alphanumeric characters, dashes, underscores, and periods, and may not exceed 128 characters.
         * 
         * @return builder
         * 
         */
        public Builder scope(@Nullable Output<String> scope) {
            $.scope = scope;
            return this;
        }

        /**
         * @param scope (String) name of databricks secret scope. Must consist of alphanumeric characters, dashes, underscores, and periods, and may not exceed 128 characters.
         * 
         * @return builder
         * 
         */
        public Builder scope(String scope) {
            return scope(Output.of(scope));
        }

        /**
         * @param stringValue (String) super secret sensitive value.
         * 
         * @return builder
         * 
         */
        public Builder stringValue(@Nullable Output<String> stringValue) {
            $.stringValue = stringValue;
            return this;
        }

        /**
         * @param stringValue (String) super secret sensitive value.
         * 
         * @return builder
         * 
         */
        public Builder stringValue(String stringValue) {
            return stringValue(Output.of(stringValue));
        }

        public SecretState build() {
            return $;
        }
    }

}
