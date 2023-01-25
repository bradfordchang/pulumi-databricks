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


public final class OboTokenState extends com.pulumi.resources.ResourceArgs {

    public static final OboTokenState Empty = new OboTokenState();

    /**
     * Application ID of databricks.ServicePrincipal to create a PAT token for.
     * 
     */
    @Import(name="applicationId")
    private @Nullable Output<String> applicationId;

    /**
     * @return Application ID of databricks.ServicePrincipal to create a PAT token for.
     * 
     */
    public Optional<Output<String>> applicationId() {
        return Optional.ofNullable(this.applicationId);
    }

    /**
     * Comment that describes the purpose of the token.
     * 
     */
    @Import(name="comment")
    private @Nullable Output<String> comment;

    /**
     * @return Comment that describes the purpose of the token.
     * 
     */
    public Optional<Output<String>> comment() {
        return Optional.ofNullable(this.comment);
    }

    /**
     * The number of seconds before the token expires. Token resource is re-created when it expires. If no lifetime is specified, the token remains valid indefinitely.
     * 
     */
    @Import(name="lifetimeSeconds")
    private @Nullable Output<Integer> lifetimeSeconds;

    /**
     * @return The number of seconds before the token expires. Token resource is re-created when it expires. If no lifetime is specified, the token remains valid indefinitely.
     * 
     */
    public Optional<Output<Integer>> lifetimeSeconds() {
        return Optional.ofNullable(this.lifetimeSeconds);
    }

    /**
     * **Sensitive** value of the newly-created token.
     * 
     */
    @Import(name="tokenValue")
    private @Nullable Output<String> tokenValue;

    /**
     * @return **Sensitive** value of the newly-created token.
     * 
     */
    public Optional<Output<String>> tokenValue() {
        return Optional.ofNullable(this.tokenValue);
    }

    private OboTokenState() {}

    private OboTokenState(OboTokenState $) {
        this.applicationId = $.applicationId;
        this.comment = $.comment;
        this.lifetimeSeconds = $.lifetimeSeconds;
        this.tokenValue = $.tokenValue;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OboTokenState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OboTokenState $;

        public Builder() {
            $ = new OboTokenState();
        }

        public Builder(OboTokenState defaults) {
            $ = new OboTokenState(Objects.requireNonNull(defaults));
        }

        /**
         * @param applicationId Application ID of databricks.ServicePrincipal to create a PAT token for.
         * 
         * @return builder
         * 
         */
        public Builder applicationId(@Nullable Output<String> applicationId) {
            $.applicationId = applicationId;
            return this;
        }

        /**
         * @param applicationId Application ID of databricks.ServicePrincipal to create a PAT token for.
         * 
         * @return builder
         * 
         */
        public Builder applicationId(String applicationId) {
            return applicationId(Output.of(applicationId));
        }

        /**
         * @param comment Comment that describes the purpose of the token.
         * 
         * @return builder
         * 
         */
        public Builder comment(@Nullable Output<String> comment) {
            $.comment = comment;
            return this;
        }

        /**
         * @param comment Comment that describes the purpose of the token.
         * 
         * @return builder
         * 
         */
        public Builder comment(String comment) {
            return comment(Output.of(comment));
        }

        /**
         * @param lifetimeSeconds The number of seconds before the token expires. Token resource is re-created when it expires. If no lifetime is specified, the token remains valid indefinitely.
         * 
         * @return builder
         * 
         */
        public Builder lifetimeSeconds(@Nullable Output<Integer> lifetimeSeconds) {
            $.lifetimeSeconds = lifetimeSeconds;
            return this;
        }

        /**
         * @param lifetimeSeconds The number of seconds before the token expires. Token resource is re-created when it expires. If no lifetime is specified, the token remains valid indefinitely.
         * 
         * @return builder
         * 
         */
        public Builder lifetimeSeconds(Integer lifetimeSeconds) {
            return lifetimeSeconds(Output.of(lifetimeSeconds));
        }

        /**
         * @param tokenValue **Sensitive** value of the newly-created token.
         * 
         * @return builder
         * 
         */
        public Builder tokenValue(@Nullable Output<String> tokenValue) {
            $.tokenValue = tokenValue;
            return this;
        }

        /**
         * @param tokenValue **Sensitive** value of the newly-created token.
         * 
         * @return builder
         * 
         */
        public Builder tokenValue(String tokenValue) {
            return tokenValue(Output.of(tokenValue));
        }

        public OboTokenState build() {
            return $;
        }
    }

}
