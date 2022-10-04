// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class UserInstanceProfileState extends com.pulumi.resources.ResourceArgs {

    public static final UserInstanceProfileState Empty = new UserInstanceProfileState();

    /**
     * This is the id of the instance profile resource.
     * 
     */
    @Import(name="instanceProfileId")
    private @Nullable Output<String> instanceProfileId;

    /**
     * @return This is the id of the instance profile resource.
     * 
     */
    public Optional<Output<String>> instanceProfileId() {
        return Optional.ofNullable(this.instanceProfileId);
    }

    /**
     * This is the id of the user resource.
     * 
     */
    @Import(name="userId")
    private @Nullable Output<String> userId;

    /**
     * @return This is the id of the user resource.
     * 
     */
    public Optional<Output<String>> userId() {
        return Optional.ofNullable(this.userId);
    }

    private UserInstanceProfileState() {}

    private UserInstanceProfileState(UserInstanceProfileState $) {
        this.instanceProfileId = $.instanceProfileId;
        this.userId = $.userId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UserInstanceProfileState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UserInstanceProfileState $;

        public Builder() {
            $ = new UserInstanceProfileState();
        }

        public Builder(UserInstanceProfileState defaults) {
            $ = new UserInstanceProfileState(Objects.requireNonNull(defaults));
        }

        /**
         * @param instanceProfileId This is the id of the instance profile resource.
         * 
         * @return builder
         * 
         */
        public Builder instanceProfileId(@Nullable Output<String> instanceProfileId) {
            $.instanceProfileId = instanceProfileId;
            return this;
        }

        /**
         * @param instanceProfileId This is the id of the instance profile resource.
         * 
         * @return builder
         * 
         */
        public Builder instanceProfileId(String instanceProfileId) {
            return instanceProfileId(Output.of(instanceProfileId));
        }

        /**
         * @param userId This is the id of the user resource.
         * 
         * @return builder
         * 
         */
        public Builder userId(@Nullable Output<String> userId) {
            $.userId = userId;
            return this;
        }

        /**
         * @param userId This is the id of the user resource.
         * 
         * @return builder
         * 
         */
        public Builder userId(String userId) {
            return userId(Output.of(userId));
        }

        public UserInstanceProfileState build() {
            return $;
        }
    }

}