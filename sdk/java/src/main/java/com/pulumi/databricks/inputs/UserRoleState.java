// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class UserRoleState extends com.pulumi.resources.ResourceArgs {

    public static final UserRoleState Empty = new UserRoleState();

    /**
     * Either a role name or the ARN/ID of the instance profile resource.
     * 
     */
    @Import(name="role")
    private @Nullable Output<String> role;

    /**
     * @return Either a role name or the ARN/ID of the instance profile resource.
     * 
     */
    public Optional<Output<String>> role() {
        return Optional.ofNullable(this.role);
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

    private UserRoleState() {}

    private UserRoleState(UserRoleState $) {
        this.role = $.role;
        this.userId = $.userId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UserRoleState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UserRoleState $;

        public Builder() {
            $ = new UserRoleState();
        }

        public Builder(UserRoleState defaults) {
            $ = new UserRoleState(Objects.requireNonNull(defaults));
        }

        /**
         * @param role Either a role name or the ARN/ID of the instance profile resource.
         * 
         * @return builder
         * 
         */
        public Builder role(@Nullable Output<String> role) {
            $.role = role;
            return this;
        }

        /**
         * @param role Either a role name or the ARN/ID of the instance profile resource.
         * 
         * @return builder
         * 
         */
        public Builder role(String role) {
            return role(Output.of(role));
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

        public UserRoleState build() {
            return $;
        }
    }

}
