// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.databricks.AwsS3MountArgs;
import com.pulumi.databricks.Utilities;
import com.pulumi.databricks.inputs.AwsS3MountState;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="databricks:index/awsS3Mount:AwsS3Mount")
public class AwsS3Mount extends com.pulumi.resources.CustomResource {
    @Export(name="clusterId", type=String.class, parameters={})
    private Output<String> clusterId;

    public Output<String> clusterId() {
        return this.clusterId;
    }
    @Export(name="instanceProfile", type=String.class, parameters={})
    private Output</* @Nullable */ String> instanceProfile;

    public Output<Optional<String>> instanceProfile() {
        return Codegen.optional(this.instanceProfile);
    }
    @Export(name="mountName", type=String.class, parameters={})
    private Output<String> mountName;

    public Output<String> mountName() {
        return this.mountName;
    }
    @Export(name="s3BucketName", type=String.class, parameters={})
    private Output<String> s3BucketName;

    public Output<String> s3BucketName() {
        return this.s3BucketName;
    }
    @Export(name="source", type=String.class, parameters={})
    private Output<String> source;

    public Output<String> source() {
        return this.source;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AwsS3Mount(String name) {
        this(name, AwsS3MountArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AwsS3Mount(String name, AwsS3MountArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AwsS3Mount(String name, AwsS3MountArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/awsS3Mount:AwsS3Mount", name, args == null ? AwsS3MountArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AwsS3Mount(String name, Output<String> id, @Nullable AwsS3MountState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/awsS3Mount:AwsS3Mount", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static AwsS3Mount get(String name, Output<String> id, @Nullable AwsS3MountState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AwsS3Mount(name, id, state, options);
    }
}
