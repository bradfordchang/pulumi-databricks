// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class ModelServingConfigArgs : global::Pulumi.ResourceArgs
    {
        [Input("servedModels", required: true)]
        private InputList<Inputs.ModelServingConfigServedModelArgs>? _servedModels;

        /// <summary>
        /// Each block represents a served model for the endpoint to serve. A model serving endpoint can have up to 10 served models.
        /// </summary>
        public InputList<Inputs.ModelServingConfigServedModelArgs> ServedModels
        {
            get => _servedModels ?? (_servedModels = new InputList<Inputs.ModelServingConfigServedModelArgs>());
            set => _servedModels = value;
        }

        /// <summary>
        /// A single block represents the traffic split configuration amongst the served models.
        /// </summary>
        [Input("trafficConfig")]
        public Input<Inputs.ModelServingConfigTrafficConfigArgs>? TrafficConfig { get; set; }

        public ModelServingConfigArgs()
        {
        }
        public static new ModelServingConfigArgs Empty => new ModelServingConfigArgs();
    }
}