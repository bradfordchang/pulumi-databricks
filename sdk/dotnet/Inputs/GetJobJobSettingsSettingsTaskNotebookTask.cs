// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class GetJobJobSettingsSettingsTaskNotebookTaskArgs : global::Pulumi.InvokeArgs
    {
        [Input("baseParameters")]
        private Dictionary<string, object>? _baseParameters;
        public Dictionary<string, object> BaseParameters
        {
            get => _baseParameters ?? (_baseParameters = new Dictionary<string, object>());
            set => _baseParameters = value;
        }

        [Input("notebookPath", required: true)]
        public string NotebookPath { get; set; } = null!;

        [Input("source")]
        public string? Source { get; set; }

        public GetJobJobSettingsSettingsTaskNotebookTaskArgs()
        {
        }
        public static new GetJobJobSettingsSettingsTaskNotebookTaskArgs Empty => new GetJobJobSettingsSettingsTaskNotebookTaskArgs();
    }
}
