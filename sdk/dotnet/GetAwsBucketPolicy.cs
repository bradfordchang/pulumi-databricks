// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks
{
    public static class GetAwsBucketPolicy
    {
        /// <summary>
        /// This datasource configures a simple access policy for AWS S3 buckets, so that Databricks can access data in it.
        /// 
        /// ## Related Resources
        /// 
        /// The following resources are used in the same context:
        /// 
        /// * Provisioning AWS Databricks E2 with a Hub &amp; Spoke firewall for data exfiltration protection guide.
        /// * End to end workspace management guide
        /// * databricks.InstanceProfile to manage AWS EC2 instance profiles that users can launch databricks.Cluster and access data, like databricks_mount.
        /// * databricks.Mount to [mount your cloud storage](https://docs.databricks.com/data/databricks-file-system.html#mount-object-storage-to-dbfs) on `dbfs:/mnt/name`.
        /// </summary>
        public static Task<GetAwsBucketPolicyResult> InvokeAsync(GetAwsBucketPolicyArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetAwsBucketPolicyResult>("databricks:index/getAwsBucketPolicy:getAwsBucketPolicy", args ?? new GetAwsBucketPolicyArgs(), options.WithDefaults());

        /// <summary>
        /// This datasource configures a simple access policy for AWS S3 buckets, so that Databricks can access data in it.
        /// 
        /// ## Related Resources
        /// 
        /// The following resources are used in the same context:
        /// 
        /// * Provisioning AWS Databricks E2 with a Hub &amp; Spoke firewall for data exfiltration protection guide.
        /// * End to end workspace management guide
        /// * databricks.InstanceProfile to manage AWS EC2 instance profiles that users can launch databricks.Cluster and access data, like databricks_mount.
        /// * databricks.Mount to [mount your cloud storage](https://docs.databricks.com/data/databricks-file-system.html#mount-object-storage-to-dbfs) on `dbfs:/mnt/name`.
        /// </summary>
        public static Output<GetAwsBucketPolicyResult> Invoke(GetAwsBucketPolicyInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetAwsBucketPolicyResult>("databricks:index/getAwsBucketPolicy:getAwsBucketPolicy", args ?? new GetAwsBucketPolicyInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetAwsBucketPolicyArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// AWS S3 Bucket name for which to generate the policy document.
        /// </summary>
        [Input("bucket", required: true)]
        public string Bucket { get; set; } = null!;

        [Input("databricksAccountId")]
        public string? DatabricksAccountId { get; set; }

        /// <summary>
        /// Your Databricks E2 account ID. Used to generate  restrictive IAM policies that will increase the security of your root bucket
        /// </summary>
        [Input("databricksE2AccountId")]
        public string? DatabricksE2AccountId { get; set; }

        /// <summary>
        /// Data access role that can have full access for this bucket
        /// </summary>
        [Input("fullAccessRole")]
        public string? FullAccessRole { get; set; }

        public GetAwsBucketPolicyArgs()
        {
        }
        public static new GetAwsBucketPolicyArgs Empty => new GetAwsBucketPolicyArgs();
    }

    public sealed class GetAwsBucketPolicyInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// AWS S3 Bucket name for which to generate the policy document.
        /// </summary>
        [Input("bucket", required: true)]
        public Input<string> Bucket { get; set; } = null!;

        [Input("databricksAccountId")]
        public Input<string>? DatabricksAccountId { get; set; }

        /// <summary>
        /// Your Databricks E2 account ID. Used to generate  restrictive IAM policies that will increase the security of your root bucket
        /// </summary>
        [Input("databricksE2AccountId")]
        public Input<string>? DatabricksE2AccountId { get; set; }

        /// <summary>
        /// Data access role that can have full access for this bucket
        /// </summary>
        [Input("fullAccessRole")]
        public Input<string>? FullAccessRole { get; set; }

        public GetAwsBucketPolicyInvokeArgs()
        {
        }
        public static new GetAwsBucketPolicyInvokeArgs Empty => new GetAwsBucketPolicyInvokeArgs();
    }


    [OutputType]
    public sealed class GetAwsBucketPolicyResult
    {
        public readonly string Bucket;
        public readonly string? DatabricksAccountId;
        public readonly string? DatabricksE2AccountId;
        public readonly string? FullAccessRole;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// (Read-only) AWS IAM Policy JSON document to grant Databricks full access to bucket.
        /// </summary>
        public readonly string Json;

        [OutputConstructor]
        private GetAwsBucketPolicyResult(
            string bucket,

            string? databricksAccountId,

            string? databricksE2AccountId,

            string? fullAccessRole,

            string id,

            string json)
        {
            Bucket = bucket;
            DatabricksAccountId = databricksAccountId;
            DatabricksE2AccountId = databricksE2AccountId;
            FullAccessRole = fullAccessRole;
            Id = id;
            Json = json;
        }
    }
}
