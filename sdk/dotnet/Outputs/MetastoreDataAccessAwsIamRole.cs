// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Outputs
{

    [OutputType]
    public sealed class MetastoreDataAccessAwsIamRole
    {
        /// <summary>
        /// The Amazon Resource Name (ARN) of the AWS IAM role for S3 data access, of the form `arn:aws:iam::1234567890:role/MyRole-AJJHDSKSDF`
        /// 
        /// `azure_service_principal` optional configuration block for credential details for Azure:
        /// </summary>
        public readonly string RoleArn;

        [OutputConstructor]
        private MetastoreDataAccessAwsIamRole(string roleArn)
        {
            RoleArn = roleArn;
        }
    }
}
