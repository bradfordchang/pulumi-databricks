// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class MwsWorkspacesCloudResourceContainerGcpArgs extends com.pulumi.resources.ResourceArgs {

    public static final MwsWorkspacesCloudResourceContainerGcpArgs Empty = new MwsWorkspacesCloudResourceContainerGcpArgs();

    /**
     * The Google Cloud project ID, which the workspace uses to instantiate cloud resources for your workspace.
     * 
     */
    @Import(name="projectId", required=true)
    private Output<String> projectId;

    /**
     * @return The Google Cloud project ID, which the workspace uses to instantiate cloud resources for your workspace.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }

    private MwsWorkspacesCloudResourceContainerGcpArgs() {}

    private MwsWorkspacesCloudResourceContainerGcpArgs(MwsWorkspacesCloudResourceContainerGcpArgs $) {
        this.projectId = $.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MwsWorkspacesCloudResourceContainerGcpArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MwsWorkspacesCloudResourceContainerGcpArgs $;

        public Builder() {
            $ = new MwsWorkspacesCloudResourceContainerGcpArgs();
        }

        public Builder(MwsWorkspacesCloudResourceContainerGcpArgs defaults) {
            $ = new MwsWorkspacesCloudResourceContainerGcpArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param projectId The Google Cloud project ID, which the workspace uses to instantiate cloud resources for your workspace.
         * 
         * @return builder
         * 
         */
        public Builder projectId(Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId The Google Cloud project ID, which the workspace uses to instantiate cloud resources for your workspace.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        public MwsWorkspacesCloudResourceContainerGcpArgs build() {
            $.projectId = Objects.requireNonNull($.projectId, "expected parameter 'projectId' to be non-null");
            return $;
        }
    }

}
