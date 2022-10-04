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


public final class TokenState extends com.pulumi.resources.ResourceArgs {

    public static final TokenState Empty = new TokenState();

    /**
     * (String) Comment that will appear on the user’s settings page for this token.
     * 
     */
    @Import(name="comment")
    private @Nullable Output<String> comment;

    /**
     * @return (String) Comment that will appear on the user’s settings page for this token.
     * 
     */
    public Optional<Output<String>> comment() {
        return Optional.ofNullable(this.comment);
    }

    @Import(name="creationTime")
    private @Nullable Output<Integer> creationTime;

    public Optional<Output<Integer>> creationTime() {
        return Optional.ofNullable(this.creationTime);
    }

    @Import(name="expiryTime")
    private @Nullable Output<Integer> expiryTime;

    public Optional<Output<Integer>> expiryTime() {
        return Optional.ofNullable(this.expiryTime);
    }

    /**
     * (Integer) The lifetime of the token, in seconds. If no lifetime is specified, the token remains valid indefinitely.
     * 
     */
    @Import(name="lifetimeSeconds")
    private @Nullable Output<Integer> lifetimeSeconds;

    /**
     * @return (Integer) The lifetime of the token, in seconds. If no lifetime is specified, the token remains valid indefinitely.
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

    private TokenState() {}

    private TokenState(TokenState $) {
        this.comment = $.comment;
        this.creationTime = $.creationTime;
        this.expiryTime = $.expiryTime;
        this.lifetimeSeconds = $.lifetimeSeconds;
        this.tokenId = $.tokenId;
        this.tokenValue = $.tokenValue;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TokenState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TokenState $;

        public Builder() {
            $ = new TokenState();
        }

        public Builder(TokenState defaults) {
            $ = new TokenState(Objects.requireNonNull(defaults));
        }

        /**
         * @param comment (String) Comment that will appear on the user’s settings page for this token.
         * 
         * @return builder
         * 
         */
        public Builder comment(@Nullable Output<String> comment) {
            $.comment = comment;
            return this;
        }

        /**
         * @param comment (String) Comment that will appear on the user’s settings page for this token.
         * 
         * @return builder
         * 
         */
        public Builder comment(String comment) {
            return comment(Output.of(comment));
        }

        public Builder creationTime(@Nullable Output<Integer> creationTime) {
            $.creationTime = creationTime;
            return this;
        }

        public Builder creationTime(Integer creationTime) {
            return creationTime(Output.of(creationTime));
        }

        public Builder expiryTime(@Nullable Output<Integer> expiryTime) {
            $.expiryTime = expiryTime;
            return this;
        }

        public Builder expiryTime(Integer expiryTime) {
            return expiryTime(Output.of(expiryTime));
        }

        /**
         * @param lifetimeSeconds (Integer) The lifetime of the token, in seconds. If no lifetime is specified, the token remains valid indefinitely.
         * 
         * @return builder
         * 
         */
        public Builder lifetimeSeconds(@Nullable Output<Integer> lifetimeSeconds) {
            $.lifetimeSeconds = lifetimeSeconds;
            return this;
        }

        /**
         * @param lifetimeSeconds (Integer) The lifetime of the token, in seconds. If no lifetime is specified, the token remains valid indefinitely.
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

        public TokenState build() {
            return $;
        }
    }

}