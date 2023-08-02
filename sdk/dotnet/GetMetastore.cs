// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks
{
    public static class GetMetastore
    {
        /// <summary>
        /// ## Related Resources
        /// 
        /// The following resources are used in the same context:
        /// * databricks.getMetastores to get mapping of name to id of all metastores.
        /// * databricks.Metastore to manage Metastores within Unity Catalog.
        /// * databricks.Catalog to manage catalogs within Unity Catalog.
        /// </summary>
        public static Task<GetMetastoreResult> InvokeAsync(GetMetastoreArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetMetastoreResult>("databricks:index/getMetastore:getMetastore", args ?? new GetMetastoreArgs(), options.WithDefaults());

        /// <summary>
        /// ## Related Resources
        /// 
        /// The following resources are used in the same context:
        /// * databricks.getMetastores to get mapping of name to id of all metastores.
        /// * databricks.Metastore to manage Metastores within Unity Catalog.
        /// * databricks.Catalog to manage catalogs within Unity Catalog.
        /// </summary>
        public static Output<GetMetastoreResult> Invoke(GetMetastoreInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetMetastoreResult>("databricks:index/getMetastore:getMetastore", args ?? new GetMetastoreInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetMetastoreArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Id of the metastore to be fetched
        /// </summary>
        [Input("metastoreId", required: true)]
        public string MetastoreId { get; set; } = null!;

        /// <summary>
        /// MetastoreInfo object for a databricks_metastore. This contains the following attributes:
        /// </summary>
        [Input("metastoreInfo")]
        public Inputs.GetMetastoreMetastoreInfoArgs? MetastoreInfo { get; set; }

        public GetMetastoreArgs()
        {
        }
        public static new GetMetastoreArgs Empty => new GetMetastoreArgs();
    }

    public sealed class GetMetastoreInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Id of the metastore to be fetched
        /// </summary>
        [Input("metastoreId", required: true)]
        public Input<string> MetastoreId { get; set; } = null!;

        /// <summary>
        /// MetastoreInfo object for a databricks_metastore. This contains the following attributes:
        /// </summary>
        [Input("metastoreInfo")]
        public Input<Inputs.GetMetastoreMetastoreInfoInputArgs>? MetastoreInfo { get; set; }

        public GetMetastoreInvokeArgs()
        {
        }
        public static new GetMetastoreInvokeArgs Empty => new GetMetastoreInvokeArgs();
    }


    [OutputType]
    public sealed class GetMetastoreResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string MetastoreId;
        /// <summary>
        /// MetastoreInfo object for a databricks_metastore. This contains the following attributes:
        /// </summary>
        public readonly Outputs.GetMetastoreMetastoreInfoResult MetastoreInfo;

        [OutputConstructor]
        private GetMetastoreResult(
            string id,

            string metastoreId,

            Outputs.GetMetastoreMetastoreInfoResult metastoreInfo)
        {
            Id = id;
            MetastoreId = metastoreId;
            MetastoreInfo = metastoreInfo;
        }
    }
}
