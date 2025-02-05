package com.example.simmanagement.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.simmanagement.databinding.FragmentExportBinding

class ExportFragment<FragmentExportBinding> : Fragment() {
    private var _binding: FragmentExportBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentExportBinding.inflate(inflater, container, false)

        // Thiết lập RecyclerView
        binding.productListRecyclerView.layoutManager = LinearLayoutManager(requireContext())
        // TODO: Gắn adapter cho RecyclerView

        // Xử lý nút xác nhận xuất hàng
        binding.confirmExportButton.setOnClickListener {
            // TODO: Thêm logic xử lý xuất hàng
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}