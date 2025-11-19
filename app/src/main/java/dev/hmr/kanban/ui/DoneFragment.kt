package dev.hmr.kanban.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import dev.hmr.kanban.R
import dev.hmr.kanban.databinding.FragmentDoneBinding
import dev.hmr.kanban.databinding.FragmentSplashBinding

class DoneFragment : Fragment() {
    private var _binding: FragmentDoneBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        this._binding = FragmentDoneBinding.inflate(
            inflater,
            container,
            false
        )
        return this.binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        this._binding = null
    }
}