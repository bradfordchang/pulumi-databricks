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


public final class MwsWorkspacesTokenArgs extends com.pulumi.resources.ResourceArgs {

    public static final MwsWorkspacesTokenArgs Empty = new MwsWorkspacesTokenArgs();

    @Import(name="comment")
    private @Nullable Output<String> comment;

    public Optional<Output<String>> comment() {
        return Optional.ofNullable(this.comment);
    }

    /**
     * Token expiry lifetime. By default its 2592000 (30 days).
     * 
     */
    @Import(name="lifetimeSeconds")
    private @Nullable Output<Integer> lifetimeSeconds;

    /**
     * @return Token expiry lifetime. By default its 2592000 (30 days).
     * 
     */
    public Optional<Output<Integer>> lifetimeSeconds() {
        return Optional.ofNullable(this.lifetimeSeconds);
    }

    @Import(name="tokenId")
    private @Nullable Output<String> tokenId;

    public Optional<Output<String>> tokenId() {
        return Optional.ofNullable(this.tokenId);
    }

    @Import(name="tokenValue")
    private @Nullable Output<String> tokenValue;

    public Optional<Output<String>> tokenValue() {
        return Optional.ofNullable(this.tokenValue);
    }

    private MwsWorkspacesTokenArgs() {}

    private MwsWorkspacesTokenArgs(MwsWorkspacesTokenArgs $) {
        this.comment = $.comment;
        this.lifetimeSeconds = $.lifetimeSeconds;
        this.tokenId = $.tokenId;
        this.tokenValue = $.tokenValue;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MwsWorkspacesTokenArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MwsWorkspacesTokenArgs $;

        public Builder() {
            $ = new MwsWorkspacesTokenArgs();
        }

        public Builder(MwsWorkspacesTokenArgs defaults) {
            $ = new MwsWorkspacesTokenArgs(Objects.requireNonNull(defaults));
        }

        public Builder comment(@Nullable Output<String> comment) {
            $.comment = comment;
            return this;
        }

        public Builder comment(String comment) {
            return comment(Output.of(comment));
        }

        /**
         * @param lifetimeSeconds Token expiry lifetime. By default its 2592000 (30 days).
         * 
         * @return builder
         * 
         */
        public Builder lifetimeSeconds(@Nullable Output<Integer> lifetimeSeconds) {
            $.lifetimeSeconds = lifetimeSeconds;
            return this;
        }

        /**
         * @param lifetimeSeconds Token expiry lifetime. By default its 2592000 (30 days).
         * 
         * @return builder
         * 
         */
        public Builder lifetimeSeconds(Integer lifetimeSeconds) {
            return lifetimeSeconds(Output.of(lifetimeSeconds));
        }

        public Builder tokenId(@Nullable Output<String> tokenId) {
            $.tokenId = tokenId;
            return this;
        }

        public Builder tokenId(String tokenId) {
            return tokenId(Output.of(tokenId));
        }

        public Builder tokenValue(@Nullable Output<String> tokenValue) {
            $.tokenValue = tokenValue;
            return this;
        }

        public Builder tokenValue(String tokenValue) {
            return tokenValue(Output.of(tokenValue));
        }

        public MwsWorkspacesTokenArgs build() {
            return $;
        }
    }

}
