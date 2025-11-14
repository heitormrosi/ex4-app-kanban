package dev.hmr.kanban.ui.auth

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import dev.hmr.kanban.R
import dev.hmr.kanban.databinding.FragmentRecoverAccountBinding


class RecoverAccountFragment : Fragment() {

    private var _binding: FragmentRecoverAccountBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
       this._binding = FragmentRecoverAccountBinding.inflate(
           inflater,
           container,
           false
       )
        val view = this.binding.root
        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        this._binding = null
    }


}