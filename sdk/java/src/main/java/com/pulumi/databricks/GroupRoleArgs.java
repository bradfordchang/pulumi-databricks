// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GroupRoleArgs extends com.pulumi.resources.ResourceArgs {

    public static final GroupRoleArgs Empty = new GroupRoleArgs();

    /**
     * This is the id of the group resource.
     * 
     */
    @Import(name="groupId", required=true)
    private Output<String> groupId;

    /**
     * @return This is the id of the group resource.
     * 
     */
    public Output<String> groupId() {
        return this.groupId;
    }

    /**
     * This is the AWS role ARN.
     * 
     */
    @Import(name="role", required=true)
    private Output<String> role;

    /**
     * @return This is the AWS role ARN.
     * 
     */
    public Output<String> role() {
        return this.role;
    }

    private GroupRoleArgs() {}

    private GroupRoleArgs(GroupRoleArgs $) {
        this.groupId = $.groupId;
        this.role = $.role;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GroupRoleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GroupRoleArgs $;

        public Builder() {
            $ = new GroupRoleArgs();
        }

        public Builder(GroupRoleArgs defaults) {
            $ = new GroupRoleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param groupId This is the id of the group resource.
         * 
         * @return builder
         * 
         */
        public Builder groupId(Output<String> groupId) {
            $.groupId = groupId;
            return this;
        }

        /**
         * @param groupId This is the id of the group resource.
         * 
         * @return builder
         * 
         */
        public Builder groupId(String groupId) {
            return groupId(Output.of(groupId));
        }

        /**
         * @param role This is the AWS role ARN.
         * 
         * @return builder
         * 
         */
        public Builder role(Output<String> role) {
            $.role = role;
            return this;
        }

        /**
         * @param role This is the AWS role ARN.
         * 
         * @return builder
         * 
         */
        public Builder role(String role) {
            return role(Output.of(role));
        }

        public GroupRoleArgs build() {
            $.groupId = Objects.requireNonNull($.groupId, "expected parameter 'groupId' to be non-null");
            $.role = Objects.requireNonNull($.role, "expected parameter 'role' to be non-null");
            return $;
        }
    }

}
